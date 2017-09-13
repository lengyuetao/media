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
     * 系统日志列表
     * @param startTm
     * @param endTm
     * @param draw
     * @param start
     * @param length
     * @return
     */
    @RequestMapping(value = "/log/list",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String list(@RequestParam(value="startTm",required = false)String startTm,
                       @RequestParam(value="endTm",required = false)String endTm,
                       @RequestParam(value="draw",required = false)Integer draw,
                       @RequestParam(value="start",required = false)Integer start,
                       @RequestParam(value="length",required = false)Integer length,
                       @RequestParam(value="logName",required = false)String logName
                        ){

        int totalCount=systemLogService.findSystemTotalCount(startTm,endTm,logName);

        List<SystemLog> list=systemLogService.getSystemLogList(startTm,endTm,start,length,logName);

        JSONObject json=new JSONObject();

        json.put("draw",draw);
        json.put("recordsTotal",totalCount);
        json.put("recordsFiltered",totalCount);
        json.put("data",list);

        return json.toString();
    }
}
