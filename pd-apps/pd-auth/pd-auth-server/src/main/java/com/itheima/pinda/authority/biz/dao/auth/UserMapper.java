package com.itheima.pinda.authority.biz.dao.auth;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.pinda.authority.entity.auth.User;
import org.springframework.stereotype.Repository;

/**
 * @author Halo
 * @create 2021/12/04 下午 04:13
 * @description Mapper 接口
 */

@Repository
public interface UserMapper extends BaseMapper<User> {
}