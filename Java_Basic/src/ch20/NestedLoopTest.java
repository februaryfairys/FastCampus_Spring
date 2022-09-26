package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		int step = 2;
		int count = 1;

		for (; step <= 9; step++) {
			for (count = 1; count <= 9; count++) {
				System.out.println(step + " * " + count + " = " + step * count);
			}
		}

		step = 2;

		while (step <= 9) {
			count = 1;
			while (count <= 9) {
				System.out.println(step + " * " + count + " = " + step * count);
				count++;
			}
			step++;
		}
	}

}
