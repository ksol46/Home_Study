package StudentInfo;

import java.util.ArrayList;

public class Student {
	//필드 선언
		//Student 클래스 안에 학번, 이름, 필수과목을 선언한다.
		private int studentId;
		private String studentName;
		private Subject majorSubject;
		
		//학생이 수강한 과목의 점수 리스트를 담을 곳을 만든다.score
		private ArrayList<Score> scoreList = new ArrayList<Score>();
		//생성자 만들기
		//학생 위에 필드 3가지 값을 받는 생성자 만들기
		public Student(int studentId,String studentName,Subject majorSubject) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.majorSubject = majorSubject;
		}
		
		//과목점수를 더해주는 메소드 만들기
		public void addSubjectScore(Score score) {
			scoreList.add(score);
		}
		
		//필드 3가지와 arraylist를 게터테서 해주기

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public Subject getMajorSubject() {
			return majorSubject;
		}

		public void setMajorSubject(Subject majorSubject) {
			this.majorSubject = majorSubject;
		}

		public ArrayList<Score> getScoreList() {
			return scoreList;
		}

		public void setScoreList(ArrayList<Score> scoreList) {
			this.scoreList = scoreList;
		}
		
		//필드 3가지와 arraylist를 게터테서 해주기
	
	
}
