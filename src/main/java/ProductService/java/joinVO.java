package ProductService.java;

public class joinVO {
	int membership_idx;
	String id, pass,name,phone;
	char sex;
	
	@Override
	public String toString() {
		return "joinVO [membership_idx=" + membership_idx + ", id=" + id + ", pass=" + pass + ", name=" + name
				+ ", phone=" + phone + ", sex=" + sex + "]";
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
}
