package com.itheima.pinda.authority.biz.service.auth.impl;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.itheima.pinda.authority.biz.service.auth.ValidateCodeService;
import com.itheima.pinda.common.constant.CacheKey;
import com.itheima.pinda.exception.BizException;
import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.base.Captcha;
import net.oschina.j2cache.CacheChannel;
import net.oschina.j2cache.CacheObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

/**
 * @author Halo
 * @create 2021/12/04 下午 03:42
 * @description 验证码服务
 */
@Service
public class ValidateCodeServiceImpl implements ValidateCodeService {
    @Autowired
    private CacheChannel cache;

    @Override
    public void create(String key, HttpServletResponse response) throws IOException {
        if (StringUtils.isBlank(key)) {
            throw BizException.validFail("验证码 key 不能为空");
        }

        response.setContentType(MediaType.IMAGE_PNG_VALUE);
        response.setHeader(HttpHeaders.PRAGMA, "No-cache");
        response.setHeader(HttpHeaders.CACHE_CONTROL, "No-cache");
        response.setDateHeader(HttpHeaders.EXPIRES, 0L);

        Captcha captcha = new ArithmeticCaptcha(115, 42);
        captcha.setCharType(2);
        // 将验证码进行缓存
        cache.set(CacheKey.CAPTCHA, key, StringUtils.lowerCase(captcha.text()));
        captcha.out(response.getOutputStream());
    }

    // 校验验证码
    @Override
    public boolean check(String key, String code) {
        if (StringUtils.isBlank(code)) {
            throw BizException.validFail("请输入验证码");
        }
        // 根据 key 从缓存中获取验证码
        CacheObject cacheObject = cache.get(CacheKey.CAPTCHA, key);
        if (cacheObject.getValue() == null) {
            throw BizException.validFail("验证码已过期");
        }
        // 比对验证码
        if (!StringUtils.equalsIgnoreCase(code,
                String.valueOf(cacheObject.getValue()))) {
            throw BizException.validFail("验证码不正确");
        }
        // 验证通过，立即从缓存中删除验证码
        cache.evict(CacheKey.CAPTCHA, key);
        return true;
    }
}
