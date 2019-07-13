package com.defrag.code.membership.restcontroller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.defrag.code.membership.MembershipVO;
import com.defrag.code.membership.service.MembershipService;


/**
 * Handles requests for the application home page.
 */

@RestController
@RequestMapping("/membership")
public class MembershipRestController {
	
	@Resource(name="memberShipService")
	private MembershipService memberShipService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String join() {
		System.out.println("hello");
		return "GET";
	}
	
	/**
	 * ȸ������ ���� INSERT
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String joinTrans(MembershipVO joinvo) {
		//int result = memberShipService.joinTrans(joinvo);
		
		return "POST";
	}
	
}
