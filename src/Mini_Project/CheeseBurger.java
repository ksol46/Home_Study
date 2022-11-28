package Mini_Project;

public class CheeseBurger extends Burger  {
    public CheeseBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }

	@Override
	public String getBurgername() {
		// TODO Auto-generated method stub
		return "치즈버거";
	}

	@Override
	public int getBurgerprice() {
		return 6000;
	}

   

}
	
	
	
	
