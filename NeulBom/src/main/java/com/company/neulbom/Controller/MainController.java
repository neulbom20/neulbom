package com.company.neulbom.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/Spring/MainController")
	public String Main() throws Exception{
		
		return"Main";
}
//	
//	@RequestMapping(value="/Spring/IntroductionController")
//	public String Introduction() throws Exception{
//		
//		return"";
//	}
//	
//	@RequestMapping(value="/Spring/LocationController")
//	public String Location() throws Exception{
//		
//		return"";
//	}
//	
}