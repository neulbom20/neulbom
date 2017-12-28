package com.company.smnb20.Controller;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.smnb20.Service.MemberDao_Father;
import com.company.smnb20.domain.MemberVo;

@Controller
public class MemberController {

	@Autowired
	MemberDao_Father md ;
		
	
	@RequestMapping(value="/spring/MemberLoginCheck")
	public String MemberLoginCheck(@ModelAttribute("mvo") MemberVo mvo, HttpServletRequest request){
		
		MemberVo mv= md.MemberLoginCheck(mvo.getId(),mvo.getPassword());
	//	model.addAttribute("mv", mv);
				
		//session
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("id", mv.getId());
		httpSession.setAttribute("idx", mv.getId());
		
		return "redirect:/spring/ListController";
		
	}
	
}
