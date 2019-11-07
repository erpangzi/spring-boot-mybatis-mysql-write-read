package com.fei.springboot.controller;

import com.fei.springboot.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


@Controller
@RequestMapping("/testController")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String hello(@RequestBody User user){

        User user1 = JSONObject.parseObject(user.toString(), User.class);

        return user1.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/hello001",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public User hello001(@RequestBody String param ,@RequestParam("test")String test){

        User user1 = JSONObject.parseObject(param, User.class);
        logger.info(user1.toString());
        logger.info(test);
        return user1;
    }

    @ResponseBody
    @RequestMapping(value = "/hello002",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public User hello002(@RequestBody String id ,@RequestBody String userName){

        User user1 = new User();
        user1.setId(id);
        user1.setUserName(userName);
        logger.info(user1.toString());
        return user1;
    }


}
