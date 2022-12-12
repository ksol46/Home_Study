package New_MiniProject;



public class YOGIYO implements OrderPrice {

	@Override
	public String getPrice(int money) {
String service;
		
		if (money >= 15000 && money < 20000 ) service = "탄산음료";
		else if (money >= 20000 && money < 30000 ) service = "전 금액 서비스 + 감자튀김";
		else if (money >= 30000 && money < 40000 ) service = "전 금액 서비스 + 치즈스틱";
		else service = "전 금액 서비스 + 코울슬로";
		
		
		return service;
	}

	
}

//주문금액별 서비스가 다름. 이전 금액 서비스에 추가됨.