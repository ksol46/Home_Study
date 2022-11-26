package Mini_Project;

public class Order {
	//필드
	protected String MemberID; //회원 아이디
	protected String MemberName; //회원 성함
	protected String NonMemberName; //비회원 성함
	int bonusPoint; //보너스 포인트 적립
	double bonusRatio; // 회원 포인트 적립 비율
	
	
	
	//생성자
	public Order() {
		reMember();
	}
	
	public Order(String MemberID,String MemberName) {
		this.MemberID = MemberID;
		this.MemberName = MemberName;
		reMember();
		
	}
	
	//메소드
	//고객 등급 초기화
	private void reMember() {
		MemberName = " ";
		bonusRatio = 0.1;
	}
	
	//보너스 포인트 계산, 가격 리턴
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);
		return price;
	}
	
	
	
}
