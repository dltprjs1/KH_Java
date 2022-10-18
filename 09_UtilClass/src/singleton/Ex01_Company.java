package singleton;

import string.Ex05;

public class Ex01_Company {

	public static void main(String[] args) {
		
//		Company com1 = new Company();
//		Company com2 = new Company();
//		Company com3 = new Company();
//		Company com4 = new Company();
//		Company com5 = new Company();
//		Company com6 = new Company();
//		Company com7 = new Company();
//		Company com8 = new Company();
//		Company com9 = new Company();
//		Company com10 = new Company();	    
		
		Company com1 = Company.b();		
		Company com2 = Company.b();
		Company com3 = Company.b();
		Company com4 = Company.b();
		Company com5 = Company.b();
		Company com6 = Company.b();
		Company com7 = Company.b();
		Company com8 = Company.b();
		Company com9 = Company.b();
		Company com10 = Company.b();
		                       
		System.out.println("com1 >>> " + com1);
		System.out.println("com2 >>> " + com2);
		System.out.println("com3 >>> " + com3);
		System.out.println("com4 >>> " + com4);
		System.out.println("com5 >>> " + com5);
		System.out.println("com6 >>> " + com6);
		System.out.println("com7 >>> " + com7);
		System.out.println("com8 >>> " + com8);
		System.out.println("com9 >>> " + com9);
		System.out.println("com10 >>> " + com10);
	}

}
