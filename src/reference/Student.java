package reference;

public class Student {
	int studentID;
	String studentName;
/*
	String koreanSubject;
	String mathSubject;
	int koreanScore;
	int mathScore;
*/
	Subject korean;
	Subject math;
	//stack메모리 후입선출
	public Student() {	// 디폴트 생성자
		korean = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {	// 매개변수 생성자
		studentID = id;
		studentName = name;
		korean = new Subject();
		math = new Subject();

	}
	
	public void setKorean(String name, int score) {		// 국어 과목 설정 메서드
		korean.setSubjectName(name);
		korean.setSubjectScore(score);
	}
	public void setMath(String name, int score) {		// 수학 과목 설정 메서드
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	public void showStudentInfo() {	// 학생 정보 출력 메서드
		int total = korean.getSugjectScore() + math.getSugjectScore();
		System.out.println(studentName+"학생의 국어 점수는 "+korean.getSugjectScore()+"점, 수학 점수는 "+ math.getSugjectScore()+"점, 총점은 "+total+"점입니다.");
	}
	
	
}
