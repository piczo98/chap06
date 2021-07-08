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
	//stack�޸� ���Լ���
	public Student() {	// ����Ʈ ������
		korean = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {	// �Ű����� ������
		studentID = id;
		studentName = name;
		korean = new Subject();
		math = new Subject();

	}
	
	public void setKorean(String name, int score) {		// ���� ���� ���� �޼���
		korean.setSubjectName(name);
		korean.setSubjectScore(score);
	}
	public void setMath(String name, int score) {		// ���� ���� ���� �޼���
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	public void showStudentInfo() {	// �л� ���� ��� �޼���
		int total = korean.getSugjectScore() + math.getSugjectScore();
		System.out.println(studentName+"�л��� ���� ������ "+korean.getSugjectScore()+"��, ���� ������ "+ math.getSugjectScore()+"��, ������ "+total+"���Դϴ�.");
	}
	
	
}
