package com.defrag.code.membership.service;

import com.defrag.code.membership.MembershipVO;

public interface MembershipService {
	//회원가입 INSERT
	int membershipTrans(MembershipVO membershipvo);
}
