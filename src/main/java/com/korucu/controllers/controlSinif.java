package com.korucu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controlSinif {

	@RequestMapping("/MainPage")
	@ResponseBody
	public String anasayfa () {
		
		return "AnaSayfaya Geldi ===>";
		
	}
	
	@RequestMapping("/jspSayfasi")
	public ModelAndView  ilkmvc () {
		
		
		
		return model;
	}
	
}
