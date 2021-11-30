package com.halo;

import com.itheima.pinda.user.annotation.EnableLoginArgResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Halo
 * @create 2021/11/30 下午 03:07
 * @description 启动类
 */
@SpringBootApplication
@EnableLoginArgResolver // 开启自动登录用户对象注入
public class UserTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserTestApplication.class, args);
    }
}