package model;

public class Student {

	private int unicode;
	private String name;
	private String major;
	private String phone;
	private String addr;
	
	
	
	
	public int getUnicode() {
		return unicode;
	}
	public void setUnicode(int unicode) {
		this.unicode = unicode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Student() {	}
	public Student(int unicode ,String name, String major, String phone,String addr) {
		this.unicode=unicode;
		this.name=name;
		this.major=major;
		this.phone=phone;
		this.addr=addr;
	}
}
