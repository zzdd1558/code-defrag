package com.defrag.code.membership.restcontroller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.defrag.code.membership.JoinVO;
import com.defrag.code.membership.service.MembershipService;
import com.defrag.code.product.service.ProductService;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/membership")
public class MembershipController {
	
	@Resource(name="memberShipService")
	private MembershipService memberShipService;
	
	//ȸ������
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		String view ="ȸ������";
		
		return view;
	}
	
	/**
	 * ȸ������ ���� INSERT
	 * @return
	 */
	@RequestMapping(value = "/joinTrans", method = RequestMethod.POST)
	public String joinTrans(JoinVO joinvo) {
			
		int result = memberShipService.joinTrans(joinvo);
		
		return "����/���� ������";
	}
	
}
