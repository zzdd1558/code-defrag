package com.defrag.code.membership.dao;

import org.springframework.stereotype.Repository;

import com.defrag.code.base.dao.AbstractDAO;
import com.defrag.code.membership.MembershipVO;

@Repository("MemberShipDAO")
public class MembershipDAO extends AbstractDAO {

	public int membershipTrans(MembershipVO membershipvo) {
		return insert("com.defrag.code.membership.insertMemberShip", membershipvo);
	}
	
}
