package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3. Map 계열의 컬렉션 프레임워크 특징
 * 		- key,value를 한 쌍으로 해서 데이터를 저장,검색하는 기능
 * 		- key는 중복 불가, value는 중복 가능 >>> key는 arrayList에서 index와 비슷하고, value는 arrayList에서 데이터값과 비슷한 역할을 한다.
 * 		- Map 인터페이스의 자식 클래스로 구현
 * 		==> HashMap(O), HashTable(O), Properties(가끔), TreeMap(X)
 */

public class Ex09 {
	//put(), get(key), KeySet(), containKey()
	public static void main(String[] args) {
		
		//Map 인터페이스의 자식클래스를 이용하여 객체 생성
		//K : key , V : value
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//1. Put() : Map에 데이터를 저장하는 메서드
		//		==> 이름을 키(key)로 저장, 점수를 값(value)으로 저장
		
		map.put("홍길동", 95);
		map.put("장길산", 90);
		map.put("이순신", 100);
		map.put("이괄", 88);
		map.put("종리추", 93);
		
		//2. get(key) : Map에 저장된 데이터를 가져오는 메서드
		//		==> get()의 인자값으로 key값을 넣으면 그에 상응하는 value값이 호출된다.
		
		System.out.println("map.get(key) : " + map.get("이순신"));
		
		//3. KeySet() : Map에 저장된 전체 데이터를 출력하는 메서드
		
		System.out.println("map.keySet() : " + map.keySet());
		System.out.println();
		
		for(String s : map.keySet()) {
			System.out.println(s+ "님의 점수 : "+map.get(s)+"점");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 사람을 선택하세요 . : ");
		
		String searchName = scan.next();
		
		//containKey() : 인자로 넘어온 키가 map에 있는지 여부를 확인하는 메서드 
		//		==> 반환형 : boolean
		if(map.containsKey(searchName)) {
			System.out.println((searchName+"님의 점수 : "+ map.get(searchName)+"점"));
		}else {
		System.out.println("겁색한 사람의 데이터는 없습니다.");
		}
	}
}
