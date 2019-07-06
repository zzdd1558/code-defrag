package com.defrag.code.membership;

public class SnsCodeVO {
	private int seq;
	private String snsCode;
	private String snsName;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSnsCode() {
		return snsCode;
	}
	public void setSnsCode(String snsCode) {
		this.snsCode = snsCode;
	}
	public String getSnsName() {
		return snsName;
	}
	public void setSnsName(String snsName) {
		this.snsName = snsName;
	}
	
	@Override
	public String toString() {
		return "SnsCodeVO [seq=" + seq + ", snsCode=" + snsCode + ", snsName=" + snsName + "]";
	}
}
