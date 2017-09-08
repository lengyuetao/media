package com.tao.service.impl;

import com.tao.entity.system.SystemLog;
import com.tao.mapper.SystemLogDao;
import com.tao.service.SystemLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2017/9/7.
 */
@Service
public class SystemLogServiceImpl implements SystemLogService {

    @Autowired
    private SystemLogDao systemLogDao;

    public boolean insert(SystemLog systemLog) {
        int count=systemLogDao.insert(systemLog);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean delete(Long id) {
       int count=systemLogDao.delete(id);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean update(SystemLog systemLog) {
        int count=systemLogDao.update(systemLog);
        if(count>0){
            return true;
        }else {
            return false;
        }
    }

    public int findSystemTotalCount(){
        return systemLogDao.findSystemTotalCount();
    }

    public SystemLog getSystemLogById(Long id) {
        return systemLogDao.getSystemLogById(id);
    }

    public List<SystemLog> getSystemLogList(String startTm,String endTm,Integer pageIndex,Integer pageSize) {
        return systemLogDao.getSystemLogList(startTm,endTm,pageIndex,pageSize);
    }
}
