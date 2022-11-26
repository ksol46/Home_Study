package Mini_Project;

public class AddCoke extends Hamburger {
	//필드
	String addcoke; //콜라 추가
	int addprice; //추가금액
	
	//생성자
	
	public AddCoke (String name, int number, String addcoke) {
		super(name,number);
		this.addcoke = "콜라추가";
		this.addprice = 500;
	}

	@Override
	public int calcPrice(int price) {
		
		return price + addprice;
	}
	
}
