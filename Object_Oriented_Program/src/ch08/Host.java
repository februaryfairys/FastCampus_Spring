package ch08;

public class Host {

	public String height;
	public String weight;
	public String gender;
	public String name;
	public String age;
	StringBuilder sb = new StringBuilder();
	
	public void showInformation() {
		
		sb.append("키가 " + height + "이고 ");
		sb.append("몸무게가 " + weight + "킬로인 ");
		sb.append(gender + "이 있습니다.");
		sb.append("이름은 " + name + "이고,");
		sb.append("나이는 " + age + "세입니다.");
		
		System.out.println(sb.toString());
	}

}
