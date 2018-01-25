package com.tao.service;

import com.tao.entity.system.SystemLog;
import com.tao.mapper.system.SystemLogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by DELL on 2017/9/7.
 */
@Service
public class SystemLogService{

    @Resource
    private SystemLogMapper systemLogMapper;

    public boolean insert(SystemLog systemLog) {
        int count=systemLogMapper.insert(systemLog);
        return count > 0;
    }

    public boolean delete(Long id) {
        int count=systemLogMapper.delete(id);
        return count > 0;
    }

    public boolean update(SystemLog systemLog) {
        int count=systemLogMapper.update(systemLog);
        return count > 0;
    }

    public int findSystemTotalCount(String startTm,String endTm,String logName){
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("startTm",startTm);
        map.put("endTm",endTm);
        map.put("logName",logName);
        return systemLogMapper.findSystemTotalCount(map);
    }

    public SystemLog getSystemLogById(Long id) {
        return systemLogMapper.getSystemLogById(id);
    }

    public List<SystemLog> getSystemLogList(String startTm,String endTm,Integer pageIndex,Integer pageSize,String logName) {
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("startTm",startTm);
        map.put("endTm",endTm);
        map.put("pageIndex",pageIndex);
        map.put("pageSize",pageSize);
        map.put("logName",logName);
        return systemLogMapper.getSystemLogList(map);
    }
}
