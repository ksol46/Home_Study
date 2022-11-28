package Mini_Project;

public class ShrimpBurger extends Burger {
    public ShrimpBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }


    
	@Override
	public String getBurgername() {
		// TODO Auto-generated method stub
		return "새우버거";
	}



	@Override
	public int getBurgerprice() {
		// TODO Auto-generated method stub
		return 7500;
	}


}
