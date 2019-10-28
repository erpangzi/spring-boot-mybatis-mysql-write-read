package com.fei.springboot.controller;

import com.fei.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testController")
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String addAndRead(String id,String userName){
        return id+"---"+userName;
    }
}
