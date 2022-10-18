package Method;

public class Ex06 {
	
	public static void change(int array[]) { //메인메서드의 arr배열의 주소값과 동일하다
		System.out.println("array배열 주소값 : "+array);
		
		for(int i=0;i<array.length;i++) {
			array[i] = array[i] * 10;
		}	
	}
	public static void main(String[] args) {
		
		//2. call by reference 방식
		
		int arr [] = new int [3];
		
		arr [0]= 10; arr[1] = 20; arr[2] = 30;
		System.out.println("change() 메서드 호출 전 ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr{"+i+"] >>>"+ arr[i]);
		}
		System.out.println("arr 배열 주소값 : "+arr);
		
		change(arr);
		
		System.out.println("change() 메서드 호출 후 ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr{"+i+"] >>>"+ arr[i]);
		}
	}
}
