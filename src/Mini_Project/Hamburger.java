package Mini_Project;

public class Hamburger { //이 클래스는 오직 햄버거만!! 데이터를 저장한다.

	//필드

	public String burgerName; // 햄버거 종류 이름
	public int burgerPice; // 햄버거 가격
	public boolean set; //세트 유무
	
	
	//생성자
	Hamburger () {
		this.burgerName="불고기버거";
		this.burgerPice=7000;
	}
	
	//메소드(기능)
	
	//세트적용 유무
	void set (int addset) {
		if (addset == 1) {
		this.set = true;
		} else if (addset == 2) {
		this.set = false;
		} else {
		this.set = false;
		}
		
	}
	
	//가격이 변동되는 메소드
	int addPrice (boolean set) {
		if (set == true) {
			return burgerPice + 1000;
		} else {
			return burgerPice;
		}
		
	}


	
	
	
}
