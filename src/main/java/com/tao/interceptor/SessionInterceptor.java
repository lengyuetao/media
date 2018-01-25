package com.tao.interceptor;

import com.tao.entity.system.SystemLog;
import com.tao.service.SystemLogService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by zhangantao on 2017/5/10.
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{
    Logger log=Logger.getLogger(SessionInterceptor.class);

    @Autowired
    private SystemLogService systemLogService;

    private static final String[] INTETERCEPT_URI= new String[] {
            "/back/login",
            "/back/loginOut",
            "/back/index",
            "/back/error"
    };

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
        String uri = request.getRequestURI();

        boolean flage = true;// 判断是否需要拦截

        for (String str : INTETERCEPT_URI) {
            if (uri.contains(str)) {
                flage = false;
                break;
            }
        }

        if(flage){
            System.out.println("请求的路径："+uri);
            Enumeration<String> paramStr=request.getParameterNames();
            StringBuffer  params=new StringBuffer();

            params.append("[");
            while (paramStr.hasMoreElements()){
                String key=paramStr.nextElement();
                String value=request.getParameter(key);
                params.append(key+"="+value+" ");
            }
            params.append("]");

            log.info(String.format("请求路径:%s\n参数:%s",uri,params.toString()));

            if(null==request.getSession().getAttribute("userName")){
                response.sendRedirect(request.getContextPath()+"/back/index");
                return false;
            }else {
                SystemLog systemLog=new SystemLog();
                systemLog.setAuthor(request.getSession().getAttribute("userName").toString());
                systemLog.setLogName("后台登录");
                systemLog.setContent("请求路径："+uri+"参数："+params);
                systemLog.setAddTime(new Date());
                systemLogService.insert(systemLog);
                return true;
            }
        }

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
