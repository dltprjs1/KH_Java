package 연습장;

public class Static {

	
	static int num1;
	static int num2;
	
	int num3;
	int num4;
	
	static int sum(int num1,int num2) {
		Static.num1=num1;
		Static.num2=num2;
		
		return num1+num2;
	}
}
