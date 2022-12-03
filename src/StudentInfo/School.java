package StudentInfo;

import java.util.ArrayList;

public class School {
	 //학교 클래스 안에..
	 // @필드선언@
	private static School instance = null;
	 //객체를 만들어야 사용할 수 있으니 학교라는 객체를 만들어주고 그 객체는 1개만으로 충분해서
	 // '싱글톤'으로 구현해준다.

	 // 이름 지정해주고
	private static String SCHOOL_NAME = "Good School";
	 // 학생들이 저장되어 있어야함 arraylist
	private ArrayList<Student> studentList = new ArrayList<Student>();
	 // 학생들이 수강하는 수업의 과목들이 저장되어 있어야함.
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	 // @생성자@
	 // 스쿨을 생성해준다.
	private School() {
		
	}
	
	//메소드
	// '싱글톤'을 구현하는 메소드도 바로 만들어준다.
	public static School getInstance() {
		if (instance == null)
			instance = new School();
		return instance;
	}
	
	 // 지금 학교에 학생이 없기 때문에 학생을 추가한다. 추가하는 메소드를 만들기.
	public void addStudent (Student student) {
		studentList.add(student);
	}
	 // 학생리스트와 과목리스트를 출력하는 게터세터로 부르기.

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
	public void addSubject(Subject subjuct) {
		subjectList.add(subjuct);
	}

	
	
	
}
