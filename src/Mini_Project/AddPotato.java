package Mini_Project;

public class AddPotato extends Hamburger {
	//필드
	static String addpotato; //감자튀김 추가
	int addprice; //추가금액
	
	//생성자
	public AddPotato (String name, int number, String addpotato) {
		super(name, number);
		this.addpotato = "감자추가";
		this.addprice = 1000;
	}

	@Override
	public int calcPrice(int price) {
		
		return price + addprice;
	}
	
	
	
}
