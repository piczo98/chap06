package reference.test;

public class Student {
	
	int studentId;
	String studentName;
	Subject korean;	// Subject => ���� �ڷ���
	Subject math;
	
	//������ ������
	public Student() {
		korean = new Subject("����");
		math = new Subject("����");
	}
	
	//�й��� �̸��� �Ű������� ���� ������
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korean = new Subject("����");
		math = new Subject("����");
	}
	
	public void setKorean(int score) {
		//void => return�� ����
//		korean.subjectScore = score;
		// korean=> subjectŸ��
		// . = > ���� ������
		korean.setSubjectScore(score);
	}
	
	public void setMath(int score) {
//		math.subjectScore = score;
		math.setSubjectScore(score);
	}
	// �л��� ������ ����ϴ� �޼���
	public  void printStudentInfo() {
		
		int total = korean.getSubjectSocre()+math.getSubjectSocre();
		System.out.println(studentName+ "�л��� " + korean.subjectName + "������ ������ " + korean.getSubjectSocre() +"��, "
		+ math.subjectName+"������ ������ "+ math.getSubjectSocre()+"��, ������ "+total +"�� �Դϴ�." );
		
	
		
		
	}
	
	
	
}
