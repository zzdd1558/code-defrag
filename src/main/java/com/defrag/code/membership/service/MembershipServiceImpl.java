package com.defrag.code.membership.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.defrag.code.membership.MembershipVO;
import com.defrag.code.membership.dao.MembershipDAO;

@Service("memberShipService")
public class MembershipServiceImpl implements MembershipService {
	
	@Resource(name="MemberShipDAO")
	private MembershipDAO MembershipDAO;

	@Override
	public int membershipTrans(MembershipVO membershipvo) {
		int result = MembershipDAO.membershipTrans(membershipvo);
		
		return result;
	}
	
}
