package Mini_Project;

public class AddSet extends Hamburger {
	//필드
		String addset; //콜라 추가
		int addprice; //추가금액
		
		//생성자
		
		public AddSet (String name, int number, String addset) {
			super(name,number);
			this.addset = "모두 추가";
			this.addprice = 1500;
		}

		@Override
		public int calcPrice(int price) {
			
			return price + addprice;
		}
		
}
