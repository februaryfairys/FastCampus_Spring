package ch04;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		String info = studentID + "�л��� �̸��� "
					+ studentName + "�̰�, �ּҴ� "
					+ address + "�Դϴ�.";
		System.out.println(info);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
