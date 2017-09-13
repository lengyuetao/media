package com.tao.service.impl;

import com.tao.entity.system.SystemLog;
import com.tao.mapper.SystemLogDao;
import com.tao.service.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DELL on 2017/9/7.
 */
@Service
public class SystemLogServiceImpl implements SystemLogService {

    @Autowired
    private SystemLogDao systemLogDao;

    public boolean insert(SystemLog systemLog) {
        int count=systemLogDao.insert(systemLog);
        return count > 0;
    }

    public boolean delete(Long id) {
       int count=systemLogDao.delete(id);
        return count > 0;
    }

    public boolean update(SystemLog systemLog) {
        int count=systemLogDao.update(systemLog);
        return count > 0;
    }

    public int findSystemTotalCount(String startTm,String endTm,String logName){
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("startTm",startTm);
        map.put("endTm",endTm);
        map.put("logName",logName);
        return systemLogDao.findSystemTotalCount(map);
    }

    public SystemLog getSystemLogById(Long id) {
        return systemLogDao.getSystemLogById(id);
    }

    public List<SystemLog> getSystemLogList(String startTm,String endTm,Integer pageIndex,Integer pageSize,String logName) {
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("startTm",startTm);
        map.put("endTm",endTm);
        map.put("pageIndex",pageIndex);
        map.put("pageSize",pageSize);
        map.put("logName",logName);
        return systemLogDao.getSystemLogList(map);
    }
}
