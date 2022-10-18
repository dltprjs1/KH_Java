package collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue 자료 구조
 * - Queue는 인터페이스에서 자식클래스로 객체를 생성하여 사용된다.
 * - 대표적인 자식 클래스는 linkedList
 * - 특징 : 선임선출(FIFO) 구조 : first in first out
 */

public class Ex07 {
	//offer(값), peek(), poll()
	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<String>();
		
		//1. offer() = queue에 저장하는 메서드
		qu.offer("101번");		
		qu.offer("102번");		
		qu.offer("103번");		
		qu.offer("104번");		
		qu.offer("105번");		
		qu.offer("106번");
		
		
		//2. peek() : queue에 저장된 데이터를 가져오는 메서드.
		//			==> queue의 맨 처음에 입력된 데이터를 가져오는 메서드
		//			==> 가져온 후 데이터를 queue에서 제거하지 않는다.
		System.out.println("qu.peek : " + qu.peek());  
		System.out.println();
		
		//3. poll() : queue에 저장된 데이터를 가져오는 메서드.
		//			==> 데이터를 가져온 후 데이터를 queue에서 제거한다.
		
		//isEmpty : 참조변수에 데이터가 남아있지 않다면 참 남아있으면 거짓
		while(!qu.isEmpty()) {
			System.out.println("qu.poll : " + qu.poll());
		}
		
	}

}
