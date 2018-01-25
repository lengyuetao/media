package com.tao.mapper;

import com.tao.entity.UserInfo;

import java.util.List;

/**
 * Created by zhangantao on 2017/4/19.
 */
public interface UserInfoMapper {

    List<UserInfo> findAllUserInfo();

    UserInfo findUserInfoById(long id);

    void insertUserInfo(UserInfo userInfo);
}
