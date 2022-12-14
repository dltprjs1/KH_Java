package khie;

//java에서의 한 줄 주석문

/* 
 * java에서이 두 줄 이상의 주석문
 */

/*
 * java프로그램 작성 방법
 * 1. 클래스 단위로 프로그램을 작성한다.
 *  ==> 클래스 이름 작성 시 첫 글자는 대문자로 작성한다.
 * 2. 하나의 문장은 세미콜론(;)으로 끝난다.
 * 3. 클래스의 이름은 첫글자를 대문자로 시작을 하고,
 * 	  메서드의 이름은 첫글자를 소문자로 작성을 한다.
 * 4. main()메서드 : 프로그램의 시작 위치를 의미한다.
 * 				   가장 먼저 실행 된다
 * 				   자바가상머신(JVM)이 main() 메서드를 찾아서 메서드 안의 내용을 순차적으로 실행한다.
 */

/*
 * java 소스 코드의 실행과정(4단계)
 * 1. java 소스 파일(.java) 작성.
 * 2. 소스 파일(.java)을 작성한 후 컴파일을 수행하면
 * 	  자바가성머신에서 동작하는 바이트 코트(.class)가 생성이 되고
 * 	  이클립스 사용 시에는 소스코드의 저장만으로도 컴파일이 자동적으로 수행이 됨. 
 *    소스 파일과 바이트 코드는 각각의 프로젝트 내의 src(바이트코드 파일)폴더와 bin(자바소스코드 파일)폴더 안에 위치함.
 * 3. 바이트 코트(.class)를 실행을 하면 자바가상머신은 운영체제에서 메모리를 할당받게 됨.
 * 4. 자바가상머신(JVM)이 main() 메서드를 실행을 함.
 */
public class Ex01 { //Ex01 클래스의 시작

	//main() 메서드 - 기능
	//프로그램의 시작 위치를 의미함, 가장 먼저 실행이 되는 놈.
	public static void main(String[] args) { //main 입력 후 ctrl + space bar 제일 상단 클릭, main메서드의 시작
		System.out.println("안녕하세요?? 자바에 오신 여러분을 환영합니다.");
		System.out.println("이세건");
		System.out.print("D"); //print() 메서드는 줄바꿈X
		System.out.println("강의실");
		System.out.println("나 자바 처음 배우는데 재미있네요");
		/* 가로(())가 들어가면 무조건 메서드이다.

		 * system.out : 자바에서의 표준출력장치를 의미함.
		 * 				표준출력장치(모니터,콘솔)
		 * println()  : 지정된 장치에 결과(" " 안의 내용)를
		 * 				출력하는 메서드.
		 * 				==> ln : line의 약자
		 * 				==> 출력을 한 후 줄바꿈을 실행하는 명령어
		 * 
		 * print()    : 지정된 장치에 결과(" "안의 내용)을 출력하는 메서드.
		 * 				==> 줄바꿈이 일어나지 않음.
		 * 				==> 다음 줄로 이동하지 않고 다음에 출력 내용을 옆(오른쪽)에 출력해주는 메서드.
		 * 
		 * 이클립스 프로그램 단축키
		 * ctrl + s   : 소스파일 저장 단축키
		 * ctrl + F11 : 실행 단축키
		 * syso + ctrl + space bar : system.out.println() 바로 출력
		 */
	}// main메서드의 끝

}//Ex01 클래스의 끝


