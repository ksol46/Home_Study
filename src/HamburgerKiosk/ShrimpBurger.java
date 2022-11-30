package HamburgerKiosk;

public class ShrimpBurger extends Burger {
    public ShrimpBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }


    
	@Override
	public String getBurgername() {
		return "새우버거";
	}



	@Override
	public int getBurgerprice() {
		return 7500;
	}


}
