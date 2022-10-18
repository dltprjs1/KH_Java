package generic;



class StringType {
	
	String str[];
	String var;
	
	void setStr(String str[]) {
		this.str=str;
	}
	void setVar(String var) {
		this.var=var;
	}
	void output() {
		for(String s : str) {
			System.out.println("str 배열 요소 >>> " + s);
		}
		System.out.println("var >>> "+ var);
	}
}
public class Ex02 {

	public static void main(String[] args) {
		
		StringType st = new StringType();
		
		String str[] = {"홍길동","이순신","유관순"};
		
		String var = "김연아";
		
		st.setStr(str);
		st.setVar(var);
		st.output();
		System.out.println();

		class IntegerType {

			Integer iarr[];
			Integer ivar;

			void setIarr(Integer iarr[]) {
				this.iarr=iarr;
			}
			void setIvar(Integer ivar) {
				this.ivar=ivar;
			}
			void output() {
				for(Integer s : iarr) {
					System.out.println("iarr 배열 요소 >>> " + s);
				}
				System.out.println("ivar >>> "+ ivar);
			}
		}
		
		IntegerType it = new IntegerType();
		
		Integer iarr [] = {10,20,30,40,50};
		Integer ivar = 500;
		
		it.setIarr(iarr);
		it.setIvar(ivar);
		it.output();
		
		
	}

}
