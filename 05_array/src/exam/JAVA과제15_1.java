package exam;

public class JAVA과제15_1 {

	public static void main(String[] args) {
		
		int arr[][]=new int[5][5];
		int count = 1;
		
		for(int i=0;i<arr.length;i++) { // 열
			for(int j=0;j<arr[i].length;j++) { // 행
				arr[j][i] = count++;
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;i++) {
				System.out.printf("%2d\t", arr[i][j]);
			}
			System.out.println();
		}
	
	
	
	
	}


}
