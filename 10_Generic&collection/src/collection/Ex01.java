package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 컬렉션 프레임워크 
 * - 컬렉션의 사전적 의미 : 수집해서 모으다, 저장하다
 * - 자바에서 컬렉션은 데이터의 추가, 수정, 삭제, 검색 등을 효과적으로 제공해 주는 자료 구조 관련 클래스이다.
 * 	==> 값을 담을 수 있는 그릇을 의미(컨테이너 개념)
 * - Java.util 패키지에 포함되어 있다.
 * - 인터페이스를 통해서 정형화된 방법으로 다양한 컬렉션 클래스를 이용
 * 
 * - 컬렉션 프레임워크
 *   1) 컬렉션을 표준화하여 설계해 높은 인터페이스
 *   2) List 계열, Set 계열, Map 계열 
 */

/********************************************************************************
 * 1. List 계열의 컬렉션 프레임워크의 특징
 * 		- 자료의 순서가 보장(index) : 정렬 기능 제공
 * 		- 중복 데이터가 허용
 * 		- List 인터페이스의 자식 클래스로 구성
 * 		==> ArrayList(O), LinkedList(가끔),Vector(X)
 * 		- 특히 DB에 데이터를 레코드 단위로 저장하거나 저장된 데이터를 가져올 경우 많이 사용이 된다.
 * ******************************************************************************
 */

public class Ex01 {
	//add(값),get(index),size(),clear(),remove(index),add(index,값)
	public static void main(String[] args) {
		
		// List 계열 컬렉션 생성 
		List<String> list = new ArrayList<String>();			//List<제네릭> 참조변수명 = new ArrayList<제네릭>(배열개수); << 배열개수는 안적어도 된다.
		
		//1. add(값) : 데이터를 추가하는 메서드 
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");		//중복 데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순");		//중복 데이터
	
		//2. size() : 데이터의 크기를 정수로 반환해 주는 메서드
		System.out.println("list 크기 : " + list.size());
		
		System.out.println();
		
		//3. get(index) : list에 저장되어 있는 데이터를 출력해주는 메서드
		
		System.out.println("1번쨰 index의 값 : " + list.get(1));
		
		System.out.println();
		
		//4. list에 있는 모든 요소를 화면에 출력해 보자.
		
		for(int i=0;i<list.size();i++) {
			System.out.println("list["+(i)+"]"+list.get(i));
		}
		System.out.println();
		
		//5. clear() : list에 있는 모든 요소를 삭제하는 메서드
		list.clear();
		
		System.out.println("list의 크기 : " + list.size());
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");		//중복 데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순");		//중복 데이터
		
		System.out.println();
		
		//6. remove(index) :  list에 있는 특정요소만을 제거하는 메서드
		//		 ==> 다음 index부터 index 값이 하나씩 당겨진다.	
		
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.println("list["+i+"]" + list.get(i));   // index의 값이 하나씩 당겨진다.
		}
		System.out.println();
		
		//7. add(index,"값") :  list의 특정 index에 데이터를 추가하는 메서드
		// 		==> 해당 index에 추가되고, 기존의 데이터들은 index가 한 칸씩 뒤로 밀려난다. 
		
		list.add(2,"세종대왕");
		for(int i=0;i<list.size();i++) {
			System.out.println("list["+i+"]" + list.get(i));
		}
		System.out.println();
		
		//8. 개선된 for문도 사용가능
		for(String s:list) {
			System.out.println(s);
		}
	}
}
