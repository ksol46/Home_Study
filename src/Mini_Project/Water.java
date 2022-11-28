package Mini_Project;

public class Water extends SideMenu {

	public Water(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);
		
	}

	@Override
	public String getSidemenuname() {
		return "물";
	}

	@Override
	public int getSidemenuprice() {
		return 500;
	}
	
}
