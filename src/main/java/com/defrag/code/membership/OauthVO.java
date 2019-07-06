package com.defrag.code.membership;

public class OauthVO {
	private String jseq;
	private String sseq;
	private String accessToken;
	private String accessTime;
	
	public String getJseq() {
		return jseq;
	}
	public void setJseq(String jseq) {
		this.jseq = jseq;
	}
	public String getSseq() {
		return sseq;
	}
	public void setSseq(String sseq) {
		this.sseq = sseq;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(String accessTime) {
		this.accessTime = accessTime;
	}
	@Override
	public String toString() {
		return "OauthVO [jseq=" + jseq + ", sseq=" + sseq + ", accessToken=" + accessToken + ", accessTime="
				+ accessTime + "]";
	}
}
