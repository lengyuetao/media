package com.tao.service.impl;

import com.tao.entity.UserInfo;
import com.tao.mapper.UserInfoDao;
import com.tao.service.UserInfoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangantao on 2017/4/18.
 */
@Component
public class UserInfoServiceImpl implements UserInfoService{
    @Resource
    UserInfoDao dao;

    public List<UserInfo> findAllUserInfo() {
        return dao.findAllUserInfo();
    }

    public UserInfo findUserInfoById(int id) {
        return dao.findUserInfoById(id);
    }

    public void insertUserInfo(UserInfo userInfo) {
        dao.insertUserInfo(userInfo);
    }
}
