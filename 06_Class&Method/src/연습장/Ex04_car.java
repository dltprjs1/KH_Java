package 연습장;

public class Ex04_car {

	public static void main(String[] args) {
		
		k3 k3=new k3();			//생성자는 ()가 붙는다 : 클래스와 차이점!!
		k3.color="white";
		k3.age =4;
		k3.cc = 1600;
		k3.door = 4;
		k3.price = 1200;
		System.out.println("**********************************************************************************");
		System.out.printf("이번 차량 k3입니다!! 색상 : %s\t연식 : %d\t배기량 : %d\tdoor : %d\t가격 : %d\n",k3.color,k3.age,k3.cc,k3.door,k3.price);
		System.out.println("**********************************************************************************");
		
		System.out.println();
		
		k5 k5=new k5();			//생성자는 ()가 붙는다 : 클래스와 차이점!!
		k5.color="black";
		k5.age=1;
		k5.cc=2200;
		k5.door = 4;
		k5.price = 2500;
		System.out.println("**********************************************************************************");
		System.out.printf("이번 차량 k5입니다!! 색상 : %s\t연식 : %d\t배기량 : %d\tdoor : %d\t가격 : %d\n",k5.color,k5.age,k5.cc,k5.door,k5.price);
		System.out.println("**********************************************************************************");
		
		System.out.println();
		k7 k7=new k7();
		
		k7.getK7Info();
		
		
	}

}
