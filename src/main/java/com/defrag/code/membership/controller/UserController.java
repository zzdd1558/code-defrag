package com.defrag.code.membership.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/membership")
public class UserController {
	
	//ȸ������
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		String view ="ȸ������";
		
		return view;
	}
	
}
