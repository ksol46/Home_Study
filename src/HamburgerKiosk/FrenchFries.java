package HamburgerKiosk;

public class FrenchFries extends SideMenu {

	public FrenchFries(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
	}

	@Override
	public String getSidemenuname() {
		return "κ°μνκΉ";
	}

	@Override
	public int getSidemenuprice() {
		return 1000;
	}
	
	

}
