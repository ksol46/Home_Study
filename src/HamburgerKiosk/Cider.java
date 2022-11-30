package HamburgerKiosk;

public class Cider extends SideMenu {

	public Cider(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
	}

	@Override
	public String getSidemenuname() {
		return "사이다";
	}

	@Override
	public int getSidemenuprice() {
		return 800;
	}

}
