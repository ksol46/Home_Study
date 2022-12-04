package StudentInfo;

public class Score {
	//필드선언
	//학번, 과목, 점수
	private int studentId;
	private Subject subject;
	private int point;
	//생성자
	public Score(int studentId,Subject subject,int point) {
		this.studentId=studentId;
		this.subject = subject;
		this.point = point;
	}
	
	//Score객체가 가지고 있는 객체들을 스트링타입으로 리턴해준다.
	@Override
	public String toString() {
		return "학번: "+this.studentId+","+subject.getSubjectName()+":"+point;
	}

	//게터세터
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	
}
