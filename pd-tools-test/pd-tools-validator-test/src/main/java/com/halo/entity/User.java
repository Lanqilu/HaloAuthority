package com.halo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

/**
 * @author Halo
 * @create 2021/11/12 下午 03:54
 * @description
 */
@Data
public class User {
    @NotNull(message = "用户 id 不能为空")
    private Integer id;

    @NotEmpty(message = "用户名不能为空")
    @Length(max = 50, message = "用户名长度不能超过 50")
    private String username;

    @Max(value = 80, message = "年龄最大为 80")
    @Min(value = 18, message = "年龄最小为 18")
    private int age;

    @Pattern(regexp = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$",
            message = "邮箱格式不正确")
    private String email;
}