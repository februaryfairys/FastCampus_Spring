package ch03;

public class FunctionTest {

	public static int addNumber(int number1, int number2) {

		int result;
		result = number1 + number2;
		return result;
	}

	public static void sayHello(String greeting) {

		System.out.println(greeting);
	}

	public static int calculateSum() {

		int sum = 0;
		int i;

		for (i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;

		int total = addNumber(number1, number2);
		System.out.println(total);

		sayHello("안녕");

		int sum = calculateSum();

		System.out.println(sum);
	}
	
	/*함수가 호출이 되면 함수 안의 쓰이는 로컬 변수들은 스택 메모리에 저장된다
	 * 
	 */
}
