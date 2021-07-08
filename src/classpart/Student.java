package classpart;

public class Student {
	// 학생의 속성(특성) : 멤버 변수
	int studentId;
	String studentName;	//String => jdk에서 제공하는 참조변수
	int grade;
	String address;
	
	// 메서드(기능)
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);  // 이름, 주소 출력
	}
	
	public static void main(String[] args) {
		Student std = new Student();	// 기본 생성자
		std.studentName = "홍길동";
		std.address = "부산시 사상구 주례동";
		std.showStudentInfo();
		
	}

}
