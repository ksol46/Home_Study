package Mini_Project;

public class BulgogiBurger extends Burger {
    public BulgogiBurger(String burgername, int burgerprice) {
        super(burgername, burgerprice);
    }

   
	@Override
	public int getPrice() {
		return 7000;
	}


	@Override
	public String getName() {
		return "불고기버거";
	}


	@Override
	public String explain() {
		return "호주산 소고기를 구워 특제 소스를 입힌 수제 햄버거 입니다.";
	}

    
}