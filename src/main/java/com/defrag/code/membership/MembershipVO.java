package com.defrag.code.membership;

public class MembershipVO {
	private int membership_idx;
	private String id;
	private String pass;
	private String name;
	private String sex;
	private String phone;
	private String email;
	private String nickName;
	
	public int getMembership_idx() {
		return membership_idx;
	}
	public void setMembership_idx(int membership_idx) {
		this.membership_idx = membership_idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "JoinVO [membership_idx=" + membership_idx + ", id=" + id + ", pass=" + pass + ", name=" + name
				+ ", sex=" + sex + ", phone=" + phone + ", email=" + email + ", nickName=" + nickName + "]";
	}
}
