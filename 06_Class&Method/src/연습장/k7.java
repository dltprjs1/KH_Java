package 연습장;

public class k7 extends car2{

	
	
	void getK7Info(){
		
		car2 car2 = new car2();
		
		car2.setAge(2);
		car2.setCc(3300);
		car2.setColor("white");
		car2.setDoor(4);
		car2.setPrice(3800);
		car2.setSunloop(false);
		car2.setWheel(4);
		
		
		
		System.out.println("**********************************************************************************");
		System.out.printf("이번 차량 k7입니다!! 색상 : %s\t연식 : %d\t배기량 : %d\tdoor : %d\t가격 : %d\n",car2.getColor(),car2.getAge(),car2.getCc(),car2.getDoor(),car2.getPrice());
		System.out.println("**********************************************************************************");
		
	}
}
