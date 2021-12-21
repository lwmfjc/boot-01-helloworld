package com.ly.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody//代表这个类所有方法都是返回字符串而不是跳转到页面
@Controller*/
@RestController //就是上面@Controller和@ResponseBody的合体
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "hello-world";
    }
}
