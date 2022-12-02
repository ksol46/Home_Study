package HamburgerKiosk;

		public class Burger {
	    private final String burgername;
	    //final 절대 바꿀 수 없음 메뉴 이름이랑 가격이어서..
	    private final int burgerprice;

	    public Burger(String burgername, int burgerprice) {
	        this.burgername = burgername;
	        this.burgerprice = burgerprice;
	    }

		public String getBurgername() {
			return burgername;
		}

		public int getBurgerprice() {
			return burgerprice;
		}

  
	    

	}
