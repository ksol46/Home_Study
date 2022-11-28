package Mini_Project;

public class Coleslaw extends SideMenu {
	public Coleslaw(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
	}

	@Override
	public String getSidemenuname() {
		return "코울슬로";
	}

	@Override
	public int getSidemenuprice() {
		return 1000;
	}
	
	
}
