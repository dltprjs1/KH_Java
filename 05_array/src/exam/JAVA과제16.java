package exam;

public class JAVA과제16 {

	public static void main(String[] args) {
		
		int count = 1;
		int ccc[][] = new int[5][];
		ccc[0] =new int[1];
		ccc[1] =new int[2];
		ccc[2] =new int[3];
		ccc[3] =new int[4];
		ccc[4] =new int[5];
		
		for(int i=0;i<ccc.length;i++) {
			for(int j=0;j<ccc[i].length;j++) {
				ccc[i][j]=count;
				System.out.printf(ccc[i][j]+"\t");
				
				count +=1;
			}
			System.out.println();
		}
	}

}
