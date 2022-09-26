package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		//단락회로평가 : 논리 연산에서 모든 항이 실행되지 않는 경우
		//논리곱의 경우 모든 논리조건의 참거짓을 판단해야 하지만
		//논리 합의 경우 앞선 조건 중 하나라도 참이 반환되면 연산을 멈추고 참을 반환함
		
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
