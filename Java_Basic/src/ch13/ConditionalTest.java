package ch13;

import java.util.Scanner;

public class ConditionalTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max;
		System.out.println("�Է� ���� �� �� �� ū ���� ����ϼ���\n");
		
		System.out.println("input1");
		int number1 = scanner.nextInt();
		
		System.out.println("input2");
		int number2 = scanner.nextInt();
		
		max = (number1 > number2) ? number1 : number2;
		System.out.println(max);
		
		scanner.close();
	}

}
