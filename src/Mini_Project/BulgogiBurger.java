package Mini_Project;

public class BulgogiBurger extends Burger {
    public BulgogiBurger(String id, int price) {
        super(id, price);
    }

    @Override
    public String getName() {
        return "불고기버거";
    }

    @Override
    public String taste() {
        return "불고기맛";
    }

}