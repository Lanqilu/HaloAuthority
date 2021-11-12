package com.halo.controller;

import com.halo.dto.MenuDTO;
import com.halo.dto.UserDTO;
import com.halo.entity.MenuEntity;
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
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    // 在 pd-tools-dozer 中已经完成了自动配置，可以直接注入
    private DozerUtils dozerUtils;

    @GetMapping("/mapper")
    public MenuEntity mapper() {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setMenuId(10);
        menuDTO.setMenuName("halo");

        MenuEntity menuEntity = dozerUtils.map(menuDTO, MenuEntity.class);
        return menuEntity;
    }
}