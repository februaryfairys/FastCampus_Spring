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
		
		/*������ �ν��Ͻ��� ���� �޸�(�� �޸�)�� ����ȴ�.
		 * �ϳ��� Ŭ�����κ��� �������� �ν��Ͻ��� �����ǰ�
		 * �� �ν��Ͻ����� ���� �ٸ� �޸� ��巹���� ������ �ȴ�.
		 * */
		
		/* ��ü: ��ü ���� ���α׷����� ���. ������ �ν��Ͻ�
		 * Ŭ���� : ��ü�� ���α׷��� �ϱ� ���� �ڵ�� ������ ���� ����
		 * �ν��Ͻ� Ŭ������ �޸𸮿� �ǽ������� �����س��� ����
		 * ��� ���� : Ŭ������ Ư��, �Ӽ�
		 * �޼��� : ��������� �̿��Ͽ� Ŭ������ ����� ������ �Լ�
		 * ���� ���� : �޸𸮿� ������ �ν��Ͻ��� ����Ű�� ����
		 * ������ : ������ �ν��Ͻ��� �޸� �ּ� ��
		 * */
	}

}
