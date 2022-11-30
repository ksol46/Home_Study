package HamburgerKiosk;

public class Coke extends SideMenu {

	public Coke(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
	}

	@Override
	public String getSidemenuname() {
		return "콜라";
	}

	@Override
	public int getSidemenuprice() {
		return 800;
	}

}
