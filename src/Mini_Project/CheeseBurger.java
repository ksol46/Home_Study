package Mini_Project;

public class CheeseBurger extends Burger  {
    public CheeseBurger(String id, int price) {
        super(id, price);
    }

    @Override
    public String getName() {
        return "치즈버거";
    }

    @Override
    public String taste() {
        return "치즈맛";
    }

}
	
	
	
	
