package Exam;

public class NameCard {
	//멤버 변수
	String name;
	String phone;
	String address;
	String job;
	
	public NameCard() {  }
	public NameCard(String name,String phone, String address,String job) {
		this.name=name;
		this.phone=phone;
		this.address=address;
		this.job=job;
		
	}
	
	void getNameCardInfo(){
		System.out.println("---------------------------------");
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phone);
		System.out.println("주소 : "+address);
		System.out.println("직급 : "+job);
	}
	
	//멤버 메서드
}
