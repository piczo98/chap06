package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ÿ� ���� �� �����Լ��� ���� ���� 
		Student std1 = new Student();	// ����Ʈ �����ڸ� �̿��� ��
		
		std1.studentName = "ȫ���";
		std1.korean.setSubjectName("����");
		std1.math.setSubjectName("����");
		std1.korean.setSubjectScore(95);
		std1.math.setSubjectScore(85);
		std1.showStudentInfo();
		
		Student std2 = new Student(1111, "�̷縶");	// �Ű� ���� �����ڸ� �̿��� ��
		std2.setKorean("����", 100);
		std2.setMath("����", 90);
		std2.showStudentInfo();
		
	}

}
