package com.halo.config;

import com.halo.service.LogService;
import com.itheima.pinda.log.event.SysLogListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Halo
 * @create 2021/11/12 下午 11:39
 * @description
 */
@Configuration
public class LogAutoConfiguration {
    // 自动配置日志监听器组件
    @Bean
    @ConditionalOnMissingBean
    public SysLogListener sysLogListener(LogService logService){
        return new SysLogListener(optLogDTO -> logService.saveLog(optLogDTO));
    }
}