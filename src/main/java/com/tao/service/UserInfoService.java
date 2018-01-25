package com.tao.service;

import com.tao.entity.UserInfo;
import com.tao.mapper.UserInfoMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangantao on 2017/4/18.
 */
@Service
public class UserInfoService{
     @Resource
     private UserInfoMapper userInfoMapper;

     public List<UserInfo> findAllUserInfo() {
          return userInfoMapper.findAllUserInfo();
     }

     @Cacheable(value="test",key = "'test_'+#id")
     public UserInfo findUserInfoById(long id) {
          System.out.println("****");
          return userInfoMapper.findUserInfoById(id);
     }

     public void insertUserInfo(UserInfo userInfo) {
          userInfoMapper.insertUserInfo(userInfo);
     }
}
