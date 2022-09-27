package ch04;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentChoi = new Student();
		
		studentChoi.studentID = 12345;
		studentChoi.setStudentName("Choi-Jiwung");
		studentChoi.address = "Seoul";
		
		studentChoi.showStudentInfo();
		
		Student studentKim = new Student();
		
		studentKim.studentID = 12121;
		studentKim.setStudentName("Kim-goeun");
		studentKim.address = "Seoul";
		
		studentKim.showStudentInfo();
		
		/*생성된 인스턴스는 동적 메모리(힙 메모리)에 저장된다.
		 * 하나의 클래스로부터 여러개의 인스턴스가 생성되고
		 * 각 인스턴스들은 각각 다른 메모리 어드레스를 가지게 된다.
		 * */
		
		/* 객체: 객체 지향 프로그래밍의 대상. 생성된 인스턴스
		 * 클래스 : 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태
		 * 인스턴스 클래스를 메모리에 실실적으로 생성해놓은 상태
		 * 멤버 변수 : 클래스의 특성, 속성
		 * 메서드 : 멤버변수를 이용하여 클래스의 기능을 구현한 함수
		 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수
		 * 참조값 : 생성된 인스턴스의 메모리 주소 값
		 * */
	}

}
