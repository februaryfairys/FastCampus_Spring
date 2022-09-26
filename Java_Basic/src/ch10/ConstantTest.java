package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		/*변하지 않는 수가 존재할 때
		 * 이를 상수로 선언하여 사용할수있다.
		 * 자료형 앞에 final 키워드를 추가하여
		 * 상수로 선언할 수 있다.
		 * */
		
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		//MAX_NUMBER = 10; //차후에 값 변경 불가.
		
		//리터럴? 프로그램에서 사용하는 숫자, 문자, 논리값등 실제로 할당된 값을 의미
		
		//자료의 형변환
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
