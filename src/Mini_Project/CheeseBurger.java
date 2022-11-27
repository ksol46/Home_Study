package Mini_Project;

public class CheeseBurger extends Hamburger {
	//필드
	
	
	//생성자
	CheeseBurger () {
		super();
		this.burgerName="치즈버거";
	}

	@Override
	int addPrice(boolean set) {
		if (set == true) {
			return burgerPice + 800;
		} else {
			return burgerPice;
		}
	}

	
	
	
	
	
	
}
