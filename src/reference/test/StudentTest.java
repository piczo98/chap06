package reference.test;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student();
		std1.studentName = "ȫ�浿";
		std1.setKorean(100);
		std1.setMath(95);
		
		std1.printStudentInfo();
		
		Student std2 = new Student(20211111, "ȫ���");
		std2.setKorean(80);
		std2.setMath(90);
		std2.printStudentInfo();
		
		// main ������ Stack�� (std1, std2)
		// �Ű��������� Heap�� ����(Id, name, korean, math) => ���� �޸�
		
		
		
		
		
		
	}

}
