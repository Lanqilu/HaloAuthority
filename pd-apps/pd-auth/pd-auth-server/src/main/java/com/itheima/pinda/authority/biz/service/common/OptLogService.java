package com.itheima.pinda.authority.biz.service.common;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pinda.authority.entity.common.OptLog;
import com.itheima.pinda.log.entity.OptLogDTO;

/**
 * @author Halo
 * @create 2021/12/04 下午 04:48
 * @description
 */
public interface OptLogService extends IService<OptLog> {
    /**
     * 保存日志
     */
    boolean save(OptLogDTO entity);
}