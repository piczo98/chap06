package reference.test;

public class Student {
	
	int studentId;
	String studentName;
	Subject korean;	// Subject => 참조 자료형
	Subject math;
	
	//디폴드 생성자
	public Student() {
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	
	//학번과 이름을 매개변수로 갖는 생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korean = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorean(int score) {
		//void => return값 없음
//		korean.subjectScore = score;
		// korean=> subject타입
		// . = > 접근 제어자
		korean.setSubjectScore(score);
	}
	
	public void setMath(int score) {
//		math.subjectScore = score;
		math.setSubjectScore(score);
	}
	// 학생의 정보를 출력하는 메서드
	public  void printStudentInfo() {
		
		int total = korean.getSubjectSocre()+math.getSubjectSocre();
		System.out.println(studentName+ "학생의 " + korean.subjectName + "과목의 점수는 " + korean.getSubjectSocre() +"점, "
		+ math.subjectName+"과목의 점수는 "+ math.getSubjectSocre()+"점, 총점은 "+total +"점 입니다." );
		
	
		
		
	}
	
	
	
}
