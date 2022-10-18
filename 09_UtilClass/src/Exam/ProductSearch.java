package Exam;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		
		ProductSearchData pro=new ProductSearchData();
		String pName =JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		String pInfo = pro.search(pName);
		try {
		pInfo.length();        /**null의 lenght()는 예외발생!*/
		JOptionPane.showInternalMessageDialog(null, pInfo);
		}catch(NullPointerException e) {
			JOptionPane.showInternalMessageDialog(null, "해당 상품이 없습니다.");
		}
	}
}