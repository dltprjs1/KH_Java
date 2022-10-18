package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.MemberDTO;

/**
 * 
 * 중요!!!
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//1. MemberDTO를 자료형으로 제네릭에 삽입 <<<클래스명을 자료형으로 사용
		List<MemberDTO> list = new ArrayList<MemberDTO>(); 
		
		System.out.println("회원 수를 입력하세요. : ");
		
		int memberCount = scan.nextInt();
		
		//2. 키보드로 회원 수만큼 회원 정보를 입력받아 ArrayList에 저장해 보자
		for(int i=0;i<memberCount;i++) {
			System.out.println((i+1)+"번째 회원의 아이디,비밀번호,이름,나이,연락처,주소를 입력하세요.");
			
		//3. MemberDTO 의 인자생성자에 값을 삽입시키는 코드를 작성	
			MemberDTO dto = new MemberDTO(scan.next(),scan.next(),scan.next(),scan.nextInt(),scan.next(),scan.next());			
		// for문안에 있는 dto는 지역변수(for문 안에서만 융통된다)
			
		list.add(dto);		//인자생성자로 생성된 값들을 list에 담기
		}
		
		//4. 실제로 list에 들어간 정보를 확인해 보자.  <<<주소값이 출력된다
		for(int i=0; i<list.size();i++) {
			System.out.println("list["+i+"] : " + list.get(i)); // 주소값 출력
		}
		System.out.println();
		
		//5. list에 들어있는 데이터들을 화면에 출력해 보자.
		for(int i=0;i<list.size();i++) {
			
		//6. 주소값을 MemberDTO의 참조변수에 저장
		//MemberDTO클래스를 자료형으로 쓴 지역변수 dto를 선언하고 초기값으로 list.get(i)를 줌(list안에 학생정보들이 들어있기떄문에)
			MemberDTO dto = list.get(i); 		
			
			System.out.println(i+"번쨰회원의 ID : "+dto.getId());
			System.out.println(i+"번쨰회원의 비밀번호 : "+dto.getPwd());
			System.out.println(i+"번쨰회원의 이름 : "+dto.getName());
			System.out.println(i+"번쨰회원의 나이 : "+dto.getAge());
			System.out.println(i+"번쨰회원의 연락처 : "+dto.getPhone());
			System.out.println(i+"번쨰회원의 주소 : "+dto.getAddress());
			System.out.println("**************************************");
		}
	}

}
