package com.lei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: cckong
 * @Date:
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test1(){
        return "test";
    }

    @RequestMapping("/a1")
    public void ajaxLogin(String name, HttpServletResponse response) throws IOException {
        System.out.println("name=====>"+name);
        if("lei".equals(name)){
            response.getWriter().print("存在该用户");
        }
        else{
            response.getWriter().print("不存在");
        }
    }
}
