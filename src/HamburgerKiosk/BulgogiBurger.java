package HamburgerKiosk;

public class BulgogiBurger extends Burger {
    public BulgogiBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }

	@Override
	public String getBurgername() {
		return "불고기버거";
	}

	@Override
	public int getBurgerprice() {
		return 7000;
	}







	}

    