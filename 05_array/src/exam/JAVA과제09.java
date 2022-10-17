package exam;

import java.util.Scanner;

public class JAVA과제09 {

	public static void main(String[] args) {
		

		
		int hap = 0;
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				hap -= i;
			}else {
				hap += i;
			}
		}System.out.println(hap);
	}

}
