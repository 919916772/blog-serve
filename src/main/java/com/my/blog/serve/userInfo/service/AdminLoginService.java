package com.my.blog.serve.userInfo.service;

import com.my.blog.serve.userInfo.entity.UserInfo;
import com.my.blog.serve.userInfo.entity.UserInfoExample;
import com.my.blog.serve.userInfo.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminLoginService {
    @Resource
    UserInfoMapper userInfoMapper;
    public List<UserInfo> selectByExample(String userName,String password){
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        if( !"".equals(userName))
            criteria.andUsernameEqualTo(userName);
        if( !"".equals(password))
            criteria.andPasswordEqualTo(password);
        return userInfoMapper.selectByExample(userInfoExample);
    }
}
