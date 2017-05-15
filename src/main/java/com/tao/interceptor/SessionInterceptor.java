package com.tao.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangantao on 2017/5/10.
 */
public class SessionInterceptor extends HandlerInterceptorAdapter{
    Logger log=Logger.getLogger(SessionInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String uri = request.getRequestURI();
        String[] noInterceptURIs = new String[] { "/back/login", "/back/logout",
                "/back/index", "/back/error", "/back/static", "/back/interfaces" };
        boolean beIntercepted = true;// 判断是否需要拦截
        for (String noInterceptURI : noInterceptURIs) {
            if (uri.indexOf(noInterceptURI) != -1) {
                beIntercepted = false;
                break;
            }
        }
        return super.preHandle(request, response, handler);

    }
}
