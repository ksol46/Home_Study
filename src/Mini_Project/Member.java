package Mini_Project;

public class Member {
	//필드
	private String member_id;
	private String member_name;
	
	//생성자
	public Member(String member_id,String member_name) {
		this.member_id = member_id;
		this.member_name = member_name;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	
	
	
	
	
}
