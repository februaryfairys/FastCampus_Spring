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

		sayHello("�ȳ�");

		int sum = calculateSum();

		System.out.println(sum);
	}
	
	/*�Լ��� ȣ���� �Ǹ� �Լ� ���� ���̴� ���� �������� ���� �޸𸮿� ����ȴ�
	 * 
	 */
}
