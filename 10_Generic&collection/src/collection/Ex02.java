package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		//Iterator : 자바의 콜렉션 프레임워크에서 컬렉션에 저장되어 있는
		//			 요소들을 읽어 오는 방법을 표준화 해 놓은 기능.
		Iterator<Integer> it =  list.iterator();
		
		//hasNext() : 읽어올 요소가 있는지 확인하는 메서드(boolean 타입)
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
