package ch11;

public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();
	
	private String line = "==================================\n";
	private String title = " �̸�\t   �ּ�\t\t  ��ȭ��ȣ  \n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("Choi\t");
		buffer.append("Seoul Korea  ");
		buffer.append("010-1234-1234");
		buffer.append("\n");
		
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String makeReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
