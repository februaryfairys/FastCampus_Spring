package ch08;

public class Order {
	
	public String orderId;
	public String phoneNumber;
	public String address;
	public String date;
	public String time;
	public String cost;
	public String menuId;
	StringBuilder sb = new StringBuilder();
	
	public String order(String orderId, String phoneNumber, String address, String date, String time, String cost,
			String menuId) {
		
		this.orderId = orderId;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.time = time;
		this.cost = cost;
		this.menuId = menuId;
		
		sb.append("��� �ֹ��� ���Խ��ϴ�.");
		sb.append("\n�ֹ� ���� ��ȣ : " + orderId);
		sb.append("\n�ֹ� �ڵ��� ��ȣ : " + phoneNumber);
		sb.append("\n�ֹ� �� �ּ� : " + address);
		sb.append("\n�ֹ� ��¥ : " + date);
		sb.append("\n�ֹ� �ð� : " + time);
		sb.append("\n�ֹ� ���� : " + cost);
		sb.append("\n�޴� ��ȣ : " + menuId);
		
		return sb.toString();
	}
}
