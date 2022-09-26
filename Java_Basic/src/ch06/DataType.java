package ch06;

public class DataType {

	public static void main(String[] args) {
		/*기본자료형 Primitive Data Type
		  정수형 : 1바이트 byte -2^7 ~ 2^7-1
		         2바이트 short -2^15 ~ 2^15-1
		  		 4바이트 int   -2^31 ~ 2^31-1   
		  		 8바이트 long  -2^63 ~ 2^63-1
		  
		  문자형 : 2바이트 char
		  
		  실수형 : 4바이트 float
		  		 8바이트 double
		  
		  논리형 : 1바이트 boolean
		   
		  변수에 할당된 값을 리터럴이라 한다.
		  변수 타입에 따라 리터럴이 크던 작던 할당되는 크기는 동일하다.*/
//====================================================================
		
		//정수
//		byte bNumber = 128; TypeMismatch
		byte bNumber = -128;
//		int number = 12345678900; outOfRangeException
//		long lNumber = 12345678900; outOfRangeException
		long lNumber = 12345678900L;
		
//====================================================================
		//실수
		/*실수는 가수부 (정수)와 지수부로 표현함
		  컴퓨터에서는 밑수가 2이므로 정규화 하게 되면 가수부분의 첫번째 자리 숫자는
		  항상 1이 된다. ex) 0.4*2^1 => 1.6*2^-3*/
		
	}

}
