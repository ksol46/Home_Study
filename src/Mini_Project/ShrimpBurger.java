package Mini_Project;

public class ShrimpBurger extends Burger {
    public ShrimpBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }

    @Override
    public String getName() {
        return "새우버거";
    }

    
	@Override
	public int getPrice() {
		return 7500;
	}

	@Override
	public String explain() {
		return "국내산 새우로 만든 패티가 들어간 수제버거 입니다.";
	}

   

}
