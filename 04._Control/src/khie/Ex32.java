package khie;

/*
 * 3. 기타(보조제어문)
 *  - break 명령어.
 *  - 현재의 제어문을 빠져 나가는 명령어
 *  - 보통은 switch~case문과 반복문에서 사용함
 *  - 반복문에서는 if문 블럭을 제외한 첫번째 블럭에서 빠져나가는 명령어
 */
public class Ex32 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i >50) {
				break; //for반복문 탈출
			} // if조건문의 end block
			System.out.println(i);
		} //for반복문의 end block
	}
}
