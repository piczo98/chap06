package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스택에 쌓인 건 메인함수의 지역 변수 
		Student std1 = new Student();	// 디폴트 생성자를 이용한 것
		
		std1.studentName = "홍길순";
		std1.korean.setSubjectName("국어");
		std1.math.setSubjectName("수학");
		std1.korean.setSubjectScore(95);
		std1.math.setSubjectScore(85);
		std1.showStudentInfo();
		
		Student std2 = new Student(1111, "이루마");	// 매개 변수 생성자를 이용한 것
		std2.setKorean("국어", 100);
		std2.setMath("수학", 90);
		std2.showStudentInfo();
		
	}

}
