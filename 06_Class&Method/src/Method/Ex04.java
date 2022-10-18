package Method;

import java.util.Scanner;

//간단한 계산기 예제

public class Ex04 {
	public static void plus(int x,int y) {
		System.out.println("덧셈 : " + (x+y));
	}
	public static void minus(int aa,int bb) { //가인수의 변수명은 아무거나 적어도 상관없음, 그러나 메인메서드의 메서드호출 실인수의 갯수는 꼭 맞춰야 한다.
		System.out.println("뺄셈 : " + (aa-bb));
		}
	public static void mul(int su1,int su2) {
		System.out.println("곱셈 : " + (su1*su2));
	}
	public static void divide(int xx,int yy) {
		System.out.println("나눗셈 : " + (xx/yy));
	}
	public static void mod(int xxx,int yyy) {
		System.out.println("나머지 : " + (xxx%yyy));
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//1. 키보드로부터 두 개의 정수와 연산자를 입력을 받자.
		System.out.println("계산할 두 개의 정수를 입력해 주십시오.");
		int x=scan.nextInt();
		int y=scan.nextInt();
		
		System.out.print("연산자(+,-,*,/,%)중 하나를 입력해 주십시오. : ");
		
		String op=scan.next();
		
		//2. 연산자 변수에 입력된 연산 기호를 가지고 해당 기호에 맞는 메서드를 호출
		switch(op) {
		case "+":
			plus(x,y);
			break;
		case "-":
			minus(x,y);
			break;
		case "*":
			mul(x,y);
			break;
		case "/":
			divide(x,y);
			break;
		case "%":
			mod(x,y);
			break;
		}
		
	}

}
