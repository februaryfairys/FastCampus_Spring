package ch22;

public class ContinueTest {

	public static void main(String[] args) {

		int number;

		for (number = 1; number <= 100; number++) {

			if (number % 3 != 0) {
				continue;
			}
			System.out.println("number : " + number);
		}
	}

}
