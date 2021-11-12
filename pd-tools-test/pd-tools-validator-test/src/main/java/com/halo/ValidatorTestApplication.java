package com.halo;

import com.itheima.pinda.validator.config.EnableFormValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Halo
 * @create 2021/11/12 下午 03:57
 * @description
 */
@SpringBootApplication
@EnableFormValidator
public class ValidatorTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ValidatorTestApplication.class, args);
    }
}