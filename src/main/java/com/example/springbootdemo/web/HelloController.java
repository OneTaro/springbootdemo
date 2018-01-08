package com.example.springbootdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangss
 * @email 1063889643@qq.com
 * @date 2018/1/8 13:52
 * @description 文件描述
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "hello springBoot!!!";
    }
}
