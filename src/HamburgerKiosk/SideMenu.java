package HamburgerKiosk;

	public class SideMenu {
	private String sidemenuname;
	private int sidemenuprice;
	
	public SideMenu(String sidemenuname, int sidemenuprice) {
		this.sidemenuname = sidemenuname;
		this.sidemenuprice = sidemenuprice;
		Null();
	}
	
	//초기화
	public void Null() {
		sidemenuname = "사이드메뉴 추가안함";
		sidemenuprice = 0;
	}

	public String getSidemenuname() {
		return sidemenuname;
	}

	public int getSidemenuprice() {
		return sidemenuprice;
	}
	
	
	
}
