package com.halo.controller;

import com.halo.dto.UserDTO;
import com.halo.entity.UserEntity;
import com.itheima.pinda.dozer.DozerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Halo
 * @create 2021/11/12 下午 03:02
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    // 在 pd-tools-dozer 中已经完成了自动配置，可以直接注入
    private DozerUtils dozerUtils;

    @GetMapping("/mapper")
    public UserEntity mapper() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(10);
        userDTO.setName("itcast");
        userDTO.setAge(20);

        UserEntity userEntity = dozerUtils.map(userDTO, UserEntity.class);
        return userEntity;
    }
}