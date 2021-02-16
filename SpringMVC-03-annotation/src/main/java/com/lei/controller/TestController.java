package com.lei.controller;

import com.lei.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:来测试网页回传参数的controller
 * @Author: cckong
 * @Date:
 */
@Controller
@RequestMapping("test")
public class TestController {
    @PostMapping("/t1")
    public String test1(@RequestParam("name") String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

    @RequestMapping("/t2")
    public String test2(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user.toString());
        return "test";
    }
}
