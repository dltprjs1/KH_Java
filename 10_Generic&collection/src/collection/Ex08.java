package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 2. Set 계열의 컬렉션 프레임워크 특징
 * 		- 자료의 순서가 없다(정렬 기능 없다 : index가 없다)
 * 		- 중복 데이터 허용 불가
 * 		- Set 인터페이스의 자식 클래스를 이용하여 구현
 * 		==> HashSet(O), TreeSet(X)
 */
public class Ex08 {

	public static void main(String[] args) {
		
		// Set 인터페이스의 자식 클래스를 이용하여 객체 생성.
		
		Set<Integer> it = new HashSet<Integer>();
		
		
		//1. add(값) : 원소를 추가하는 메서드
		
		it.add(100);
		it.add(200);
		it.add(300);	//중복
		it.add(400);
		it.add(500);
		it.add(300);	//중복
		
		//2. size() : 원소의 크기를 알려주는 메서드
		
		System.out.println("it.size() : " + it.size());		//중복되는 데이터는 허용하지 않는다
		System.out.println();
		
		Iterator<Integer> iter = it.iterator();
		//hasNext : 참조변수에 데이터가 남아있으면 참 남아있지 않으면 거짓
		//next() : 참조변수의 다음 데이터 호출
		while(iter.hasNext()) {
			System.out.println(iter.next());				//index가 없기 때문에 정렬기능이 존재하지 않는다 : 무작위 호출			
		}
	}
}
