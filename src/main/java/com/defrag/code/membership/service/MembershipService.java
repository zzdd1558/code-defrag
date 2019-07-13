package com.defrag.code.membership.service;

import com.defrag.code.membership.JoinVO;

public interface MembershipService {
	
	//회원가입 INSERT
	int joinTrans(JoinVO joinvo);
}
