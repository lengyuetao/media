package com.tao.mapper;

import com.tao.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhangantao on 2017/4/19.
 */
@Repository
public interface UserInfoDao {

    List<UserInfo> findAllUserInfo();

    UserInfo findUserInfoById(int id);

    void insertUserInfo(UserInfo userInfo);
}
