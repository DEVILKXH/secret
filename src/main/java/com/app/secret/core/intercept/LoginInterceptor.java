package com.app.secret.core.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.secret.core.base.annotation.IgnoreToken;
import com.app.secret.core.util.StringUtil;
import com.auth0.jwt.JWT;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.app.secret.core.constant.Constant;

import java.lang.reflect.Method;

public class LoginInterceptor implements HandlerInterceptor{
	

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HandlerMethod handlerMethod = (HandlerMethod)handler;
        Method method = handlerMethod.getMethod();
        Class<?> c = method.getDeclaringClass();
        if(c.isAnnotationPresent(IgnoreToken.class) || method.isAnnotationPresent(IgnoreToken.class)) {
            return true;
        }
        String token = request.getHeader("token");
        if(StringUtil.isNull(token)) {
            throw  new RuntimeException("无token，请重新登录");
        }
        String userCode = JWT.decode(token).getAudience().get(0);
	    //获取session
        HttpSession session = request.getSession(true);
        //判断用户ID是否存在，不存在就跳转到登录界面
        if(session.getAttribute(Constant.USER_KEY) == null){
        	response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }else{
            session.setAttribute(Constant.USER_KEY, session.getAttribute("userId"));
            return true;
        }
    }
}
