package com.tao.mapper;

import com.tao.entity.system.SystemLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DELL on 2017/9/7.
 */
@Repository
public interface SystemLogDao {

    int insert(SystemLog systemLog);

    int delete(Long id);

    int update(SystemLog systemLog);

    int findSystemTotalCount();

    SystemLog getSystemLogById(Long id);

    List<SystemLog> getSystemLogList(@Param("startTm")String startTm,@Param("endTm")String endTm,
                                     @Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize);
}
