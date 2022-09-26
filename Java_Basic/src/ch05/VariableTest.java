package ch05;

public class VariableTest {

	public static void main(String[] args) {
		//변수에는 정수, 실수, 참거짓, 문자, 문자열 등이 들어갈 수 있다.
		//변수를 선언하기 위해서는 변수에 맞는 데이터 타입을 먼저 정해야 한다.
		//변수에서 '=' 기호는 동등하다는 뜻이 아니라
		//Left Value에 Right Value를 할당한다는 뜻이다.
		
		int age, count; //변수 여러개를 동시에 선언할 수 있다.
		age = 10;
		count = 0;
		
		int level = 10000; //변수 선언과 동시에 할당할 수 있다.
		
		System.out.println(age);
		System.out.println(count);
		System.out.println(level);
		
		/*자바에는 명명규칙, 즉 Naming convention이 있다.
		  
		  클래스 이름은 대문자로 시작하는 쌍봉낙타.
		  변수, 메서드, 패키지 이름은 소문자로 시작하는 단봉낙타.
		  
		  변수 이름은 숫자로 시작할 수 없다.
		  
		  변수 이름은 영문자, 숫자, 한글도 사용할 수 있지만
		  변수 외의 문자는 권장되지 않고 특수기호는 $와 _만 사용할 수 있다.
		  
		  변수 이름의 길이는 길어도 상관 없지만 변수의 역할이나 정체성을
		  명확히 표현하는 것이 좋다.*/
	}

}
