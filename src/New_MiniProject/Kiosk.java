package New_MiniProject;

public class Kiosk {
	//필드
	//싱글톤으로 키오스크 객체 생성
	//외부에서 객체 생성이 되면 안됨.
	private static Kiosk Order = new Kiosk();
	
	
	//생성자
	
	
	
	//메소드
	//싱글톤으로 주문받는 키오스트 Order 객체 생성
	public static Kiosk getOrder() {
		if(Order == null)
			Order = new Kiosk();
		return Order;
	}
	
	
	
}
