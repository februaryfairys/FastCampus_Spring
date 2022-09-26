package ch13;

import java.util.Scanner;

public class ConditionalTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int max;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하세요\n");
		
		System.out.println("input1");
		int number1 = scanner.nextInt();
		
		System.out.println("input2");
		int number2 = scanner.nextInt();
		
		max = (number1 > number2) ? number1 : number2;
		System.out.println(max);
		
		scanner.close();
	}

}
