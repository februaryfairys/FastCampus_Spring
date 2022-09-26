package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		int number1 = 15;
		byte number2 = (byte) number1;
		
		System.out.println(number2);
		
		double number3 = 3.14;
		int number4 = (int) number3;
		
		System.out.println(number4);
		
		double number5 = 1.2;
		float number6 = 0.9f;
		
		int number7 = (int) number5 + (int) number6;
		int number8 = (int) (number5 + number6);
		
		System.out.println(number7);
		System.out.println(number8);
	}
}
