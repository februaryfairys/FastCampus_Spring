package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentChoi = new Student(100, "Choi");
		studentChoi.setKorean("Korean", 98);
		studentChoi.setMath("Math", 96);
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKorean("Korean", 95);
		studentKim.setMath("Math", 100);
		
		studentChoi.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
