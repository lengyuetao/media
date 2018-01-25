package com.tao.mapper.system;

import com.tao.entity.system.SystemLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DELL on 2017/9/7.
 */
@Repository
public interface SystemLogMapper {

    int insert(SystemLog systemLog);

    int delete(Long id);

    int update(SystemLog systemLog);

    int findSystemTotalCount(Map<String, Object> map);

    SystemLog getSystemLogById(Long id);

    List<SystemLog> getSystemLogList(Map<String, Object> map);
}
