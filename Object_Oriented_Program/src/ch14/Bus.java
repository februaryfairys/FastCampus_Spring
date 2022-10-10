package ch14;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(busNumber + "¹ø ¹ö½º");
		System.out.println("½Â°´ ¼ö : " + passengerCount + "¸í.");
		System.out.println("¼öÀÔ : " + money + "¿ø.");
	}
}
