package com.tao.service;

import com.tao.entity.UserInfo;
import com.tao.mapper.UserInfoMapper;
import com.tao.service.UserInfoService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangantao on 2017/4/18.
 */
@Service
public class UserInfoService{
     @Resource
     UserInfoMapper userInfoMapper;

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
