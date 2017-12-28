package com.company.smnb20.interceptor;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MemberInterceptor extends HandlerInterceptorAdapter{

	
	public void postHandle(HttpServletRequest request, HttpServletResponse response){
		
	}
}
