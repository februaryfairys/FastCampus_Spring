package ch08;

public class Host {

	public String height;
	public String weight;
	public String gender;
	public String name;
	public String age;
	StringBuilder sb = new StringBuilder();
	
	public void showInformation() {
		
		sb.append("Ű�� " + height + "�̰� ");
		sb.append("�����԰� " + weight + "ų���� ");
		sb.append(gender + "�� �ֽ��ϴ�.");
		sb.append("�̸��� " + name + "�̰�,");
		sb.append("���̴� " + age + "���Դϴ�.");
		
		System.out.println(sb.toString());
	}

}
