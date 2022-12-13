package New_MiniProject;

public class YOGIYO implements OrderPrice {

	@Override
	public String getPrice(int money) {
		String service;
		if (money >= 18000 && money <= 23000) service = "감자튀김";
		else if (money > 23000 && money <= 28000) service = "코울슬로";
		else if (money > 28000 && money <= 31000) service = "치즈스틱";
		else service = "윙봉 3조각";
		
		return service;
	}

	

	
}



/*
BAEMIN, YOGIYO 각각 서비스 지급 주문금액이 다르다.
*/
