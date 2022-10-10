package ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentChoi = new Student("Choi", 5000);
		Student studentKim = new Student("Kim", 5000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		Subway lineNumber2 = new Subway(2);
		Subway lineNumber7 = new Subway(7);
		
		studentChoi.takeSubway(lineNumber2);
		studentChoi.takeBus(bus500);
		
		studentKim.takeSubway(lineNumber7);
		studentKim.takeBus(bus500);
		
		bus500.showBusInfo();
		bus100.showBusInfo();
		
		lineNumber2.showSubwayInfo();
		lineNumber7.showSubwayInfo();
	}

}
