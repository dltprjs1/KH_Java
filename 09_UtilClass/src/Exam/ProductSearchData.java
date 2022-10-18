package Exam;

import java.util.Scanner;

public class ProductSearchData {
	Scanner scan = new Scanner(System.in);
	String productName;
	String productInfo;
	String proTable [][] = new String [2][4];
	
	
	
	public ProductSearchData() {	
		this.proTable[0][0] = "상품명";
		this.proTable[0][1] = "세탁기";
		this.proTable[0][2] = "냉장고";
		this.proTable[0][3] = "TV";
		this.proTable[1][0] = "상품정보";
		this.proTable[1][1] = "드럼 세탁기 최신형";
		this.proTable[1][2] = "지펠 냉장고 최신형";
		this.proTable[1][3] = "HDTV 150인치 최신 모델";
	}
	
	String search(String productName) {
		productInfo=null;
		System.out.println("검색할 삼품명을 입력하세요.");
		//String search = scan.next();
		for(int i=0;i<proTable.length;i++) {
			for(int j=0;j<proTable[i].length;j++) {
				if(productName.equalsIgnoreCase(proTable[0][j])) {
					productInfo=proTable[1][j];
				}
			}
		}
		//System.out.println(productInfo);
		return productInfo;
	}
}
