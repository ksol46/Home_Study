package Mini_Project;

public class ShrimpBurger extends Burger {
    public ShrimpBurger(String id, int price) {
        super(id, price);
    }

    @Override
    public String getName() {
        return "새우버거";
    }

    @Override
    public String taste() {
        return "새우맛";
    }

}
