package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		/*������ �ʴ� ���� ������ ��
		 * �̸� ����� �����Ͽ� ����Ҽ��ִ�.
		 * �ڷ��� �տ� final Ű���带 �߰��Ͽ�
		 * ����� ������ �� �ִ�.
		 * */
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		//MAX_NUMBER = 10; //���Ŀ� �� ���� �Ұ�.
		
		//���ͷ�? ���α׷����� ����ϴ� ����, ����, ������ ������ �Ҵ�� ���� �ǹ�
		
		//�ڷ��� ����ȯ
		byte bote = 10;
		char chal = 'A';
		short shorb = bote;
		int ant = shorb; 
			ant = chal;
		long lond = ant;
		float fload = lond;
		double doubol = fload;
		
		System.out.println(doubol);
	}

}
