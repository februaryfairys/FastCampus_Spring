package ch21;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int number = 1;

		for (;; number++) {
			sum += number;
			
			if (sum >= 100) {
				break;
			}
		}

		System.out.println("sum : " + sum);
		System.out.println("number : " + number);
	}

}
