package ch09;

public class LocalVariableType {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "world";
		
		System.out.println(str);
		
		/* �ڹ� 10 �̻󿡼� �ڷ����� Ÿ���� �������� �ʾƵ� �ȴ�.
		 * �ٸ� �������������� ��� �����ϸ� �ѹ� ���� �Ҵ��ϰ� ����
		 * ������ Ÿ���� ������ ���� ����.
		 * */
	}

}
