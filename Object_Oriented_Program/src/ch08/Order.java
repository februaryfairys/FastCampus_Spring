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
		
		sb.append("배달 주문이 들어왔습니다.");
		sb.append("\n주문 접수 번호 : " + orderId);
		sb.append("\n주문 핸드폰 번호 : " + phoneNumber);
		sb.append("\n주문 집 주소 : " + address);
		sb.append("\n주문 날짜 : " + date);
		sb.append("\n주문 시간 : " + time);
		sb.append("\n주문 가격 : " + cost);
		sb.append("\n메뉴 번호 : " + menuId);
		
		return sb.toString();
	}
}
