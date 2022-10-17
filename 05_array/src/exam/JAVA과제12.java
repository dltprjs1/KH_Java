package exam;

import java.util.Scanner;

public class JAVA과제12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tmp = 0;
		System.out.println("배열의 크기를 입력해주십시오. :");
		int bb [] = new int [scan.nextInt()];
		System.out.println("임의의 숫자 입력해주십시오.");
		for(int i=0;i<bb.length;i++) {
		bb[i] = scan.nextInt();
		}
		System.out.println("===내림차순으로 정렬===");
		for(int i=0;i<bb.length;i++) {
			for(int j=i+1;j<bb.length;j++) {
				if(bb[i]<bb[j]) {
					tmp = bb[i];
					bb[i] = bb[j];
					bb[j] = tmp;
				}
			}
			System.out.print(bb[i]+"\t");
		}
	}

}
