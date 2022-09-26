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
		
		/* 자바 10 이상에서 자료형의 타입을 지정하지 않아도 된다.
		 * 다만 지역변수에서만 사용 가능하며 한번 값을 할당하고 나면
		 * 데이터 타입을 변경할 수는 없다.
		 * */
	}

}
