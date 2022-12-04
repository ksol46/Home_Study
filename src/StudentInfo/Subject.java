package StudentInfo;

import java.util.ArrayList;

public class Subject {
	//필드선언
	//과목명, 과목코드, 점수타입을 필드에 선언한다.
	private String subjectName;
	private int subjectId;
	private int gradeType;

	//과목을 신청한 학생리스트를 만든다. arrayList
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	//생성자를 만든다.
	public Subject(String subjectName,int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}
	
	//메소드
	//수강신청한 학생을 등록한다.
	public void register(Student student) {
		studentList.add(student);
	}
	
	//게터세터로 메소드 만들어준다.

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
}
