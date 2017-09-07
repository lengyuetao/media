package com.tao.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by zhangantao on 2017/5/10.
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{
    Logger log=Logger.getLogger(SessionInterceptor.class);

    private static final String[] INTETERCEPT_URI= new String[] {
            "/back/login",
            "/back/logout",
            "/back/index",
            "/back/error"
    };

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
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
               return true;
            }
        }

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
