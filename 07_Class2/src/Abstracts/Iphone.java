package Abstracts;

public class Iphone extends SmartPhone{

	
	@Override
	void spec() {
		company = "애플"; name = "Iphone 13";color= "레드";size="17cm";weight = "280g";
		price = "150만원";
				
		System.out.println(company +" / "+name +" / "+color +" / "+size +" / "+weight +" / "+price +" / ");
	}

}
