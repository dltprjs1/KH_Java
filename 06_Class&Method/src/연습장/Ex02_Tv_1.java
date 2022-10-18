package 연습장;
/*
 *  [문제] TV 객체를 만들되 tv1이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하시오.
 *  
 *  조건 1. 색상:흰색, 전원:off, 채널:15
 *  조건 2. tv1 정보를 화면에 출력 - display() 메서드
 *  조건 3. tv1 정보를 다음과 같이 변경하여 화면에 출력해 보시오.
 *  	   색상: 흰색, 전원: on, 채널: 28
 */

/*
 *  [문제2] TV 객체를 만들되 tv1이라는 참조변수를 이용하여 객체를 만들어 아래와 같이 정보를 변경하시오.
 *  
 *  조건 1. 색상:흰색, 전원:off, 채널:32
 *  조건 2. tv2 정보를 화면에 출력 - display() 메서드
 *  조건 3. tv2 정보를 다음과 같이 변경하여 화면에 출력해 보시오.
 *  	   색상: 검정색, 전원: on, 채널: 11
 */

//문제1-1
public class Ex02_Tv_1 {
String color;
boolean power;
int channel=32;

void color() {
	color="흰색";
}
void power() {
	power = !power;
	if(!power) {
		System.out.println("on");
	}else {
		System.out.println("off");
	}
}
void channelUp() {
	if(power) {
		channel++;
	}
}
void channelDown() {
	if(power) {
		channel--;
	}
}
void display() {
	power=false;
	color="흰색";
	channel=15;
	System.out.println(color);
	System.out.println(channel);
	
}


//문제1-3
void power1() {
	power = !power;
	if(power) {
		System.out.println("on");
	}else {
		System.out.println("off");
	}
}
void display1() {
	color="흰색";
	channel=28;
	System.out.println(color+"\n"+channel);
}

//문제2-1
void power2() {
	power = !power;
	if(!power) {
		System.out.println("on");
	}else {
		System.out.println("off");
	}
}
void display2() {
	color="흰색";
	channel=32;
	System.out.println(color+"\n"+channel);
}

void display3() {
	color="검정색";
	for(int i=0;i<21;i++) {
		channel--;
	}
	System.out.println(color);
	System.out.println(channel);
}
void power3() {
	power = !power;
	if(power) {
		System.out.println("on");
	}else {
		System.out.println("off");
	}
	System.out.println(power);
}
}
