package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		//�ܶ�ȸ���� : �� ���꿡�� ��� ���� ������� �ʴ� ���
		//������ ��� ��� �������� �������� �Ǵ��ؾ� ������
		//�� ���� ��� �ռ� ���� �� �ϳ��� ���� ��ȯ�Ǹ� ������ ���߰� ���� ��ȯ��
		
		int numberOne = 10;
		int i = 2;
		
		boolean valueOne = ((numberOne = numberOne + 10) < 10
							&& (i = i+2) < 10);
		boolean valueTwo = ((numberOne = numberOne + 10) < 10
							|| (i = i+2) < 10);
		
		System.out.println(valueOne);
		System.out.println(valueTwo);
		
	}

}
