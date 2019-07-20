package com.defrag.code.membership.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.defrag.code.membership.MembershipVO;
import com.defrag.code.membership.service.MembershipService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/membership")
public class MembershipController {
	
	@Resource(name="memberShipService")
	private MembershipService memberShipService;
	
	/**
	 * 회원가입 페이지
	 * @return
	 */
	@RequestMapping(value = "/membershipJoin", method = RequestMethod.GET)
	public String membership() {
		return "home";
	}
	
	/**
	 * 회원 정보 INSERT
	 * @return
	 */
	@RequestMapping(value = "/membershipTrans", method = RequestMethod.POST)
	public String membershipTrans(MembershipVO membershipvo) {
		
		int result = memberShipService.membershipTrans(membershipvo);
		
		if(result == 1) {
			return "main";	
		} else {
			return "실패";
		}
	}
}
