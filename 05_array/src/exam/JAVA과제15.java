package exam;

public class JAVA과제15 {

	public static void main(String[] args) {
		
		int count = 1;
		int aaa[][] = new int[5][5];
		
		for(int i=0;i<aaa.length;i++) {
			for(int j=0;j<aaa[i].length;j++) {
				aaa[i][j]=count;
				count +=1;
				
				
			}
		}
		for(int i=0;i<aaa.length;i++) {
			for(int j=0;j<aaa[i].length;j++) {
				System.out.print(aaa[j][i]+"\t");
			}
			System.out.println();
		}
	}
}
