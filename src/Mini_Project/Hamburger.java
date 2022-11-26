package Mini_Project;

public class Hamburger {

	//필드
//	public static String Cheeseburger;
//	public static String Shirimpburger;
//	public static String Veganburger;
	
	public String name; //주문자 이름
	public int number; // 휴대폰번호 뒷자리 4개
	public int burger; //버거

	
	//생성자
	public Hamburger () {
	
	}
	
	public Hamburger(String name, int number) {
		this.name = name;
		this.number = number;
		this.burger=burger;
	}


	public int calcPrice(int price) {
		return price;
	}
	
	public String OrderList() {
		return name + (",")+ number +  "님은 " + burger + "을(를)주문하였습니다.";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBurger() {
		return burger;
	}

	public void setBurger(int burger) {
		this.burger = burger;
	}
	
	
}
