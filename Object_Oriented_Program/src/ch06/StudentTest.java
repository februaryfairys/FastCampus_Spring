package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentChoi = new Student();
		
		studentChoi.studentName = "Choi-jiwung";
		studentChoi.studentNumber = 202209;
		System.out.println(studentChoi.showStudentInfo());
		
		Student studentKim = new Student(202209, 2, "Kin-goeun");
		System.out.println(studentKim.showStudentInfo());
	}

}
