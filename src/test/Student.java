package test;

public class Student {
	
	Student student = new Student();
	int studentId;
	String studentName;	//String => jdk���� �����ϴ� ��������
	
	int grade;
	String address;

	public String getstudentName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
