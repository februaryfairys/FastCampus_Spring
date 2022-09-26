package ch17;

public class WhileTest {

	public static void main(String[] args) {
		int number = 1;
		int sum = 0;

		while (number <= 10) {
			sum += number;
			number++;
		}
		System.out.println("sum : " + sum);
		System.out.println("number : " + number);
	}

}
