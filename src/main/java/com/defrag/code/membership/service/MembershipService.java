package com.defrag.code.membership.service;

import com.defrag.code.membership.JoinVO;

public interface MembershipService {
	
	//ȸ������ INSERT
	int joinTrans(JoinVO joinvo);
}
