package ch09;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korean;
	Subject math;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		korean.subjectName = name;
		korean.score = score;
	}
	
	public void setMath(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void showScoreInfo() {
		int total = korean.score + math.score;
		System.out.println("���� : " + total);
	}
}
