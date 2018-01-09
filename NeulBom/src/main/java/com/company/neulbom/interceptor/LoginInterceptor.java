package com.company.neulbom.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {	
	
	@Override
public void postHandle(HttpServletRequest request,HttpServletResponse response,
			 Object handler,ModelAndView ModelAndView) 
					throws Exception{
		
		HttpSession session =request.getSession();
	
		 Object Member_id = ModelAndView.getModel().get("Member_id");
		 Object Member_idx = ModelAndView.getModel().get("Member_idx");
		

	
		if(Member_id !=null){
			session.setAttribute("Member_id",Member_id);
			session.setAttribute("Member_idx",Member_idx);

			
		}
	}
	
	 @Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
			
		 HttpSession session = request.getSession();
		 
		 if(session.getAttribute("Member_id") != null){
			 session.removeAttribute("Member_id");
			 session.removeAttribute("Member_idx");			
		 }
		 return true;		
	 	}
}
