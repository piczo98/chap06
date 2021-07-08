package test;

public class Student {
	
	Student student = new Student();
	int studentId;
	String studentName;	//String => jdk에서 제공하는 참조변수
	
	int grade;
	String address;

	public String getstudentName() {
		return studentName;
		
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
