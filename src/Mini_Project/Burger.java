package Mini_Project;

abstract public class Burger {
	    private final String id;
	    private final int price;

	    public Burger(String id, int price) {
	        this.id = id;
	        this.price = price;
	    }

	    public String getId() {
	        return id;
	    }

	    public int getPrice() {
	        return price;
	    }

	    abstract public String taste();

	    abstract public String getName();
	}
