package ch04;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		String info = studentID + "학생의 이름은 "
					+ studentName + "이고, 주소는 "
					+ address + "입니다.";
		System.out.println(info);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
