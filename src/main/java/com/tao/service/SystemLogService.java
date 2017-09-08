package com.tao.service;

import com.tao.entity.system.SystemLog;

import java.util.List;

/**
 * Created by DELL on 2017/9/7.
 */
public interface SystemLogService {
    boolean insert(SystemLog systemLog);

    boolean delete(Long id);

    boolean update(SystemLog systemLog);

    SystemLog getSystemLogById(Long id);

    int findSystemTotalCount();

    List<SystemLog> getSystemLogList(String startTm,String endTm,Integer pageIndex,Integer pageSize);
}
