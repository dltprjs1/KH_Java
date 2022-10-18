package inheritance;
/*
 *  1.super() 키워드
 *  - 자식 클래스에서 부모 클래스의 생성자를 호출하는 명령어
 *   	형식) super(인자);   //인자는 생략도 가능
 *   
 *  2.this() 키워드
 *  - 현재 클래스에서 현재 클래스의 다른 생성자를 호출하는 명령어
 * 		형식) this(인자);
 * 		주의) this() 키워드는 반드시 생성자 첫 문장에 와야한다.
 */
public class Point3D extends Point{
	//멤버변수
	private int z;
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	//멤버메서드
	public Point3D() {
		super(); 			//부모(Point) 클래스의 기본 생성자 호출 명령어!
	}

	public Point3D(int x,int y) {
		super(x,y);			//부모(Point) 클래스의 인자 생성자 호출 명령어
	}
	public Point3D(int x,int y,int z) {
		super(x,y);			//부모(Point) 클래스의 인자 생성자 호출 명령어
		this.z = z;			//Point3D 클래스의 멤버변수z = 인자생성자의 매개변수z
	}
	
	void output() {			
		
		System.out.println("x 좌표 >>> " +x);
		System.out.println("y 좌표 >>> " +y);
		System.out.println("z 좌표 >>> " +getZ());
		
	}
}
