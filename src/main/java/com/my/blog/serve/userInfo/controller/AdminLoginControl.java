package com.my.blog.serve.userInfo.controller;

import com.alibaba.fastjson.JSONObject;
import com.my.blog.serve.userInfo.entity.UserInfo;
import com.my.blog.serve.userInfo.entity.UserInfoExample;
import com.my.blog.serve.userInfo.mapper.UserInfoMapper;
import com.my.blog.serve.userInfo.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/person")
public class AdminLoginControl {


    @Autowired
    private AdminLoginService adminLoginService;

    @RequestMapping(value="adminLogin",method = RequestMethod.POST)
    public String adminLogin(@RequestBody Map<String,String> map){
        String username=  map.get("username");
        String password=  map.get("password");
        List<UserInfo> adminList = adminLoginService.selectByExample(username,password);
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("adminInfo",adminList);
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }
}
