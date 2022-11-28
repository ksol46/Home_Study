package Mini_Project;

public class CheeseBurger extends Burger  {
    public CheeseBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }

    @Override
    public String getName() {
        return "치즈버거";
    }

	@Override
	public int getPrice() {
		return 6000;
	}

	@Override
	public String explain() {
		return "불고기버거에 자연산 모짜렐라 치즈가 추가된 수제버거 입니다.";
	}

   

}
	
	
	
	
