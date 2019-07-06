package com.defrag.code.membership.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.defrag.code.membership.JoinVO;
import com.defrag.code.membership.dao.MembershipDAO;

@Service("memberShipService")
public class MembershipServiceImpl implements MembershipService {
	
	@Resource(name="MemberShipDAO")
	private MembershipDAO MembershipDAO;

	@Override
	public int joinTrans(JoinVO joinvo) {
		int result = MembershipDAO.joinTrans(joinvo);
		
		return result;
	}
	
}
