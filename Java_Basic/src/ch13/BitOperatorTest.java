package ch13;

public class BitOperatorTest {

	public static void main(String[] args) {
		int number1 = 5; //00000101
		int number2 = 10;//00001010
	
		System.out.println("number1 | number2 : " + ( number1 | number2));
		//��Ʈ�� ������ "or" �� ��Ʈ �� �ϳ��� 1�� �� true ��ȯ
		System.out.println("number1 & number2 : " + ( number1 & number2));
		//��Ʈ�� ������ "and" �� ��Ʈ�� ��� 1�� ���� true ��ȯ
		System.out.println("number1 ^ number2 : " + ( number1 ^ number2));
		//��Ʈ������ ������ "xor" �� ��Ʈ�� �ٸ� ��쿡�� true ��ȯ
		System.out.println("~number1 : " + (~number1));
		//��Ʈ���� ������ ��Ʈ�� true�� false�� ������Ŵ
		System.out.println("number1<<3 : " + (number1<<3));
		//����Ʈ ������ ������ �ڸ�����ŭ ��Ʈ�� �̵���Ŵ
		System.out.println("number1 <<=2 : " + (number1<<=2));
		//�� ����Ʈ �����ڴ� ���Կ����ڷμ� �����
		System.out.println(number1);
		//���� ���ԵǾ���.
	}

}
