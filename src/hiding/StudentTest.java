package hiding;

import hiding.test.Student;	// ctrl + shift + o : 패키지 임포트(포함)

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setStudentName("홍길동");	// 공개된 메서드로 은닉된 멤버 변수의 값을 변경 가능
		
		
		
		
		
		
	}

}
