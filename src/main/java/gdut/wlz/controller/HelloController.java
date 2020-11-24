package gdut.wlz.controller;

import gdut.wlz.domain.User;
import gdut.wlz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author: BUG_BOY
 * DATE:2020/11/20  11:19
 */
@RestController
public class HelloController {

    @Resource
    private DataSource dataSource;
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(dataSource);
        return "Hello SpringBoot！！！";
    }

    @GetMapping("/hello/{id}")
    public User query(@PathVariable Long id) {
        return userService.findById(id);
    }
}
