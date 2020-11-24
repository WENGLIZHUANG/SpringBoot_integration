package gdut.wlz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author: BUG_BOY
 * DATE:2020/11/20  11:20
 */
@SpringBootApplication
@MapperScan("gdut.wlz.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
