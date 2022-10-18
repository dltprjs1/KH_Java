package util;

import java.util.Calendar;

/*
 * 3. calendar 클래스
 *  - 날짜 / 시간과 관련된 정보를 제공해 주는 클래스
 *  - calendar 클래스는 추상클래스이다.
 *  - 추상클래스로 작성된 이유 : 날짜와 시간을 계산하는 방법이 지역,나라 마다 다르기 떄문
 *  - calendar 클래스는 날짜와 시간을 계산하는데 꼭 필요한 메서드나 상수로 구성이 되어있다.
 *  - calendar 클래스는 객체 생성을 하려면 calendar 클래스가 가지고 있는 클래스(정적) 메서드
 *    getInstance() 메서드를 사용하면 객체 생성이 가능하다 << static 클래스 
 *  - getInstance() 메서드를 호출하면 내부적으로 java.util.gregoriancalendar 클래스의 자식 클래스로 객체 생성
 *  - getInstance() : 싱글턴 방식, 하나의 인스턴스만을 가지고 공유해서 사용할 때 쓰는 방식 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 날짜와 관련된 정보를 확인하는 방법
		int year = cal.get(Calendar.YEAR);			//연
		int month = cal.get(Calendar.MONTH)+1; 		//월   >>> gregoriancalendar는 1월을 0으로 표시하기때문에 +1 해야한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);	//일
		
		System.out.println("현재 연도 : "+year+"년");
		System.out.println("현재 월 : "+month+"월"); 
		System.out.println("현재 일 : "+day+"일");
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);	//52주(1년) 중 몇번째 주인지 알려주는 메서드
		System.out.println("현재 몇째 주 : "+week+"주");
		
		System.out.println();
		
		//시간과 관련된 정보를 확인하는 방법 
		// 1. 12시간제를 이용하는 방법 - 오전 : 0, 오후 : 1
		int am_pm = cal.get(Calendar.AM_PM);		// 오전 / 오후 : 0 / 1
		int hour = cal.get(Calendar.HOUR);			// 시간
		int minute = cal.get(Calendar.MINUTE);		// 분
		int second = cal.get(Calendar.SECOND);		// 초
		
		if(am_pm == 0) {
			System.out.println("현재 시간은 오전");
		}else {
			System.out.println("현재 시간은 오후");
		}
		System.out.println("현재 시간 : "+hour+"시");
		System.out.println("현재 분 : "+minute+"분");
		System.out.println("현재 초 : "+second+"초");
		System.out.println();
		
		// 2. 24시간제를 이용하는 방법
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("현재 시간 : "+hours+"시");	// 24 시간제
	}

}
