package exam;

import java.util.Scanner;

public class JAVA과제07 {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i-1;j++) {
				//System.out.print("*");
			}//System.out.println("*");
		}
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=4;j++) {
				//System.out.print("*");
			}//System.out.println("*");
		}
		
		//1. 올라가는 별 찍기
		for(int i=0;i<=5;i++) { //1변수 : 라인(행)
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//2. 내려가는 별 찍기
		for(int i=5;i>=1;i--) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			System.out.println();
		}
		
		
		
		
		
		
	}

	}
}
