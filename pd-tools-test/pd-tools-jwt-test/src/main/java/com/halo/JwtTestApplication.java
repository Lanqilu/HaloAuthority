package com.halo;

import com.itheima.pinda.auth.server.EnableAuthServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Halo
 * @create 2021/11/13 下午 09:41
 * @description
 */
@SpringBootApplication
// 启用 JWT 服务端认证功能
@EnableAuthServer
public class JwtTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtTestApplication.class, args);
    }
}