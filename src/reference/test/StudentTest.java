package reference.test;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student();
		std1.studentName = "홍길동";
		std1.setKorean(100);
		std1.setMath(95);
		
		std1.printStudentInfo();
		
		Student std2 = new Student(20211111, "홍길순");
		std2.setKorean(80);
		std2.setMath(90);
		std2.printStudentInfo();
		
		// main 변수는 Stack에 (std1, std2)
		// 매개변수들은 Heap에 저장(Id, name, korean, math) => 동적 메모리
		
		
		
		
		
		
	}

}
