package khie;

import javax.swing.JOptionPane;

/*
 * [문제] 키보드로부터 두 개의 정수를 입력을 받자
 * 		입력받은 두 수를 이용하여 산술연산을 진행해 보자.
 */

public class Ex09 {

	public static void main(String[] args) {
		
		
		/*
		String su1 = args[0]; // 0번째 Index에 변수 su1 선언
		String su2 = args[1]; // 1번째 Index에 변수 su2 선언
		
		int num1 = Integer.parseInt(su1); // String 타입의 su1을 정수형 데이터 타입으로 변경 (Integer.parseInt())
		int num2 = Integer.parseInt(su2); // String 타입의 su2을 정수형 데이터 타입으로 변경 (Integer.parseInt())
		
		System.out.println(num1 + num2);
		*/
	
		
		
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		
		System.out.println(su1 +su2);
		
		
		int su3 = Integer.parseInt(JOptionPane.showInputDialog("첫번째 정수 입력"));
		int su4 = Integer.parseInt(JOptionPane.showInputDialog("두번째 정수 입력"));
		int su5 = Integer.parseInt(JOptionPane.showInputDialog("세번째 정수 입력"));
		int su6 = Integer.parseInt(JOptionPane.showInputDialog("네번째 정수 입력"));
		int su7 = Integer.parseInt(JOptionPane.showInputDialog("다섯번째 정수 입력"));
		int su8 = Integer.parseInt(JOptionPane.showInputDialog("여섯번째 정수 입력"));
		int su9 = Integer.parseInt(JOptionPane.showInputDialog("일곱번째 정수 입력"));
		System.out.println(su3+su4);
		
		
		
		
	}

}

