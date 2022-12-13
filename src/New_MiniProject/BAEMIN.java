package New_MiniProject;

public class BAEMIN implements OrderPrice {

	@Override
	public String getPrice(int money) {
		String service;
		
		if (money >= 15000 && money <= 20000) service = "감자튀김";
		else if (money > 20000 && money <= 25000) service = "코울슬로";
		else if (money > 25000 && money <= 30000) service = "치즈스틱";
		//if문은 조건식이기 때문에 ()안에 조건을 넣어줌.
		else service = "윙봉 3조각";
		//그 나머지의 의미라서 ()조건 넣는거 없음.
		return service;
	}

	
	}


	

/*
  BAEMIN, YOGIYO 각각 서비스 지급 주문금액이 다르다.
*/
