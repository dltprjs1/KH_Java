package khie;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("직급(사장/전무/부장/차장/과장/대리/사원) 중 하나의 직급을 선택해주십시오. :");
		
		String Position = scan.next();
		
		switch(Position) {
		
		case "사장":
			System.out.println("사장의 월급는 1,000만원 입니다.");
			break;
		case "전무":
			System.out.println("전무의 월급는 800만원 입니다.");
			break;
		case "부장":
			System.out.println("부장의 월급는 650만원 입니다.");
			break;
		case "차장":
			System.out.println("차장의 월급는 500만원 입니다.");
			break;
		case "과장":
			System.out.println("과장의 월급는 400만원 입니다.");
			break;
		case "대리":
			System.out.println("대리의 월급는 300만원 입니다.");
			break;
		case "사원":
			System.out.println("사원의 월급는 250만원 입니다.");
		default:
			System.out.print("직급(사장/전무/부장/차장/과장/대리/사원) 중 하나의 직급을 선택해주십시오. :");
			
		}
		
		//다음 if~else문을 이용하여 위와 같은 결과 값 가져오기
		
		System.out.println();
		
		if(Position.equals("사장")) {    //if(Position == "사장")(X)
			System.out.println("사장의 월급은 1,000만원 입니다.");
		}else if(Position.equals("전무")) {
			System.out.println("전무의 월급은 850만원 입니다.");
		}else if(Position.equals("부장")) {
			System.out.println("부장의 월급은 650만원 입니다.");
		}else if(Position.equals("차장")) {
			System.out.println("차장의 월급은 500만원 입니다.");
		}else if(Position.equals("과장")) {
			System.out.println("과장의 월급은 400만원 입니다.");
		}else if(Position.equals("대리")) {
			System.out.println("대리의 월급은 300만원 입니다.");
		}else if(Position.equals("사원")) {
			System.out.println("사원의 월급은 250만원 입니다.");
		}
		scan.close();
	}

}
