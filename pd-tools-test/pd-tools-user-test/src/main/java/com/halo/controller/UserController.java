package com.halo.controller;

import com.itheima.pinda.user.annotation.LoginUser;
import com.itheima.pinda.user.model.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Halo
 * @create 2021/11/30 下午 03:09
 * @description Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getCurrentUser")
    public SysUser getCurrentUser(@LoginUser SysUser user) { // 注入当前登录用户
        System.out.println(user);
        return user;
    }
}