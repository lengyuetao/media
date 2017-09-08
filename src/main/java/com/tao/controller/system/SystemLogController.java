package com.tao.controller.system;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tao.entity.system.SystemLog;
import com.tao.service.SystemLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 2017/9/7.
 */
@Controller
public class SystemLogController {

    private static final Logger logger=Logger.getLogger(SystemLogController.class);

    @Autowired
    private SystemLogService systemLogService;

    @RequestMapping(value="/log/index")
    public String index(){
        return "/back/system/system-log";
    }

    /**
     *
     * @param startTm
     * @param endTm
     * @param sEcho 当前页
     * @param iDisplayStart 起始条数
     * @param iDisplayLength 每页显示的条数
     * @return
     */
    @RequestMapping(value = "/log/list",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String list(@RequestParam(value="startTm",required = false)String startTm,
                       @RequestParam(value="endTm",required = false)String endTm,
                       @RequestParam(value="sEcho",required = false)Integer sEcho,
                       @RequestParam(value="iDisplayStart",required = false)Integer iDisplayStart,
                       @RequestParam(value="iDisplayLength",required = false)Integer iDisplayLength){

        int totalCount=systemLogService.findSystemTotalCount();
        List<SystemLog> list=systemLogService.getSystemLogList(startTm,endTm,(sEcho-1)*iDisplayStart,iDisplayLength);

        JSONObject json=new JSONObject();

        json.put("sEcho",sEcho+1);
        json.put("iTotalRecords",totalCount);
        json.put("iTotalDisplayRecords",list.size());
        json.put("aData",list);
        return json.toString();
    }
}
