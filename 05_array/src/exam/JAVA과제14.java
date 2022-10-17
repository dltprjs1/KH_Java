package exam;

public class JAVA과제14 {

	public static void main(String[] args) {
		int count = 1;
		int aaa[][] = new int[5][5];
		
		for(int i=0;i<aaa.length;i++) { // 행
			for(int j=0;j<aaa[i].length;j++) { // 열
				aaa[i][j]=count;
				System.out.print(aaa[i][j]+"\t");
				
				count +=1;
			}
			System.out.println();
		}
	}

}
