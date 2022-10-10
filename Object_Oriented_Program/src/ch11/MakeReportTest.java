package ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		
		MakeReport makeReport = new MakeReport();
		String report = makeReport.makeReport();
		
		System.out.println(report);
	}

}
