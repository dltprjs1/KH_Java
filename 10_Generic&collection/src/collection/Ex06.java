package collection;

import java.util.Stack;

/*
 * Stack 클래스(자료구조)
 * - 후임선출(LIFO) 구조 : last in first out
 */
public class Ex06 {
//push(값), peek(), pop() , isEmpty()
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		//1. push() : stack에 저장시키는 메서드
		stack.push("강감찬");
		stack.push("이순신");
		stack.push("을지문덕");
		stack.push("왕건");
		stack.push("이성계");
		
		//2. peek() : stack에 저장된 데이터를 가져오는 메서드
		//		==> - stack의 맨위(마지막)에 입력된 데이터를 출력하는 메서드
		//      ==> - 가져온 후 데이터를 stack에서 제거하지 않음.
		System.out.println("stack.peek() : " + stack.peek());
		System.out.println();
		
		//3. pop() : stack에 저장된 데이터를 가져오는 메서드.
		//		==> - stack의 맨위(마지막)에 입력된 데이터를 가져오는 메서드
		//		==> - 가져온 후 데이터를 stack에서 제거한다.
		
		//isEmpty() : 현재 데이터가 비어있다면 참 그렇지 않다면 거짓
		
		while(!stack.isEmpty()) {
			System.out.println("stack.pop() : " + stack.pop());
			
		}
	}

}
