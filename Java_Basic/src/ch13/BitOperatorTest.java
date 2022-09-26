package ch13;

public class BitOperatorTest {

	public static void main(String[] args) {
		int number1 = 5; //00000101
		int number2 = 10;//00001010
	
		System.out.println("number1 | number2 : " + ( number1 | number2));
		//비트합 연산자 "or" 두 비트 중 하나라도 1일 때 true 반환
		System.out.println("number1 & number2 : " + ( number1 & number2));
		//비트곱 연산자 "and" 두 비트가 모두 1일 때만 true 반환
		System.out.println("number1 ^ number2 : " + ( number1 ^ number2));
		//비트부정합 연산자 "xor" 두 비트가 다른 경우에만 true 반환
		System.out.println("~number1 : " + (~number1));
		//비트반전 연산자 비트의 true와 false를 반전시킴
		System.out.println("number1<<3 : " + (number1<<3));
		//쉬프트 연산자 지정한 자릿수만큼 비트를 이동시킴
		System.out.println("number1 <<=2 : " + (number1<<=2));
		//이 쉬프트 연산자는 대입연산자로서 기능함
		System.out.println(number1);
		//값이 대입되었다.
	}

}
