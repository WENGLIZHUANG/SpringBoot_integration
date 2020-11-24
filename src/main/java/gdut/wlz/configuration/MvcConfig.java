package gdut.wlz.configuration;

import gdut.wlz.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author: BUG_BOY
 * DATE:2020/11/23  16:16
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 将拦截器注册到spring ioc容器
     * @return myInterceptor
     */
    @Bean
    public MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }


    /**
     * 重写该方法；往拦截器链添加自定义拦截器
     * @param registry  拦截器链
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过registry添加myInterceptor拦截器，并设置拦截器路径为 /*
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
    }
}
