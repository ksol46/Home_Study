package Mini_Project;

public class FrenchFries extends SideMenu {

	public FrenchFries(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
	}

	@Override
	public String getSidemenuname() {
		return "감자튀김";
	}

	@Override
	public int getSidemenuprice() {
		return 1000;
	}
	
	

}
