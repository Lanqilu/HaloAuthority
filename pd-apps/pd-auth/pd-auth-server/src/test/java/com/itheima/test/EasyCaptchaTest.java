package com.itheima.test;

import com.wf.captcha.ArithmeticCaptcha;
import com.wf.captcha.base.Captcha;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author Halo
 * @create 2021/12/04 下午 03:30
 * @description
 */
public class EasyCaptchaTest {
    public static void main(String[] args) throws Exception {
        // 算术类型图片验证码
        Captcha captcha = new ArithmeticCaptcha(115, 42); // 指定图片的宽度和高度
        // 设置验证码字符混合模式
        captcha.setCharType(2);
        captcha.out(new FileOutputStream(new File("d:\\Captcha.png")));
        String text = captcha.text();
        System.out.println(text);
    }
}