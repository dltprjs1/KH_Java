package packages;

import model.MemberDTO;

/*
 * 패키지(package)?
 * - 서로 연관성이 있는 클래스들과 인터페이스들의 묶음을 말함
 * - 패키지는 물리적으로 폴더 개념과 유사하다.
 * - 패키지는 서브 패키지를 가질 수 있으며, "."으로 구분한다.
 * - import 키워드 : 현재 패키지의 클래스에서 다른 패키지에 있는 다른 클래스를 사용하고 싶은 경우 import 해야 한다.
 * 				   단, 동일한 패키지에 있는 다른 클래스를 사용할 경우에는 생략 가능
 * 		형식) import 패키지명.서브패키지명.클래스명;
 * - import 단축 키 : ctrl + shift + o
 */
public class Ex01 {

	public static void main(String[] args) {
		
		//Model 패키지에 있는 memberDTO클래스 사용
		MemberDTO dto = new MemberDTO();
		dto.setId("hong");
		dto.setPwd("1234");
		dto.setName("홍길동");
		dto.setAge(27);
		dto.setPhone("010-1234-2345");
		dto.setAddress("서울시 회기동");
		
		// 저장된 회원의 정보를 화면에 출력해 보자.
		System.out.println("회원 아이디 >>> "+ dto.getId());
		System.out.println("회원 패스워드 >>> "+ dto.getPwd());
		System.out.println("회원 이름 >>> "+ dto.getName());
		System.out.println("회원 나이 >>> "+ dto.getAge());
		System.out.println("회원 연락처 >>> "+ dto.getPhone());
		System.out.println("회원 주소 >>> "+ dto.getAddress());
		
	}

}
