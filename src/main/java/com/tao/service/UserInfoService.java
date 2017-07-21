package com.tao.service;

import com.tao.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangantao on 2017/4/18.
 */
@Service
public interface UserInfoService {

     public List<UserInfo> findAllUserInfo();

     public UserInfo findUserInfoById(long id);

     public void  insertUserInfo(UserInfo userInfo);
}
