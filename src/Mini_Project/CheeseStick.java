package Mini_Project;

public class CheeseStick extends SideMenu {

	public CheeseStick(String sidemenuname, int sidemenuprice) {
		super(sidemenuname, sidemenuprice);

	}

	@Override
	public String getSidemenuname() {
		return "치즈스틱";
	}

	@Override
	public int getSidemenuprice() {
		return 1000;
	}
	
	
	
}
