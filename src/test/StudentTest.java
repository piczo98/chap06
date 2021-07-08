package test;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Student student = new Student();
		student.setStudentName("이루마");
		System.out.println(student.getstudentName());
		
		Student student2 = new Student();
		student2.setStudentName("홍길동");
		System.out.println(student.getstudentName());
		
		System.out.println(student);
		System.out.println(student2);
	}

}
