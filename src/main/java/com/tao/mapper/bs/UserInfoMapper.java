package com.tao.mapper.bs;

import com.tao.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhangantao on 2017/4/19.
 */
public interface UserInfoMapper {

    List<UserInfo> findAllUserInfo();

    UserInfo findUserInfoById(long id);

    void insertUserInfo(UserInfo userInfo);
}
