package classpart;

public class Student {
	// �л��� �Ӽ�(Ư��) : ��� ����
	int studentId;
	String studentName;	//String => jdk���� �����ϴ� ��������
	int grade;
	String address;
	
	// �޼���(���)
	public void showStudentInfo() {
		System.out.println(studentName + ", "+ address);  // �̸�, �ּ� ���
	}
	
	public static void main(String[] args) {
		Student std = new Student();	// �⺻ ������
		std.studentName = "ȫ�浿";
		std.address = "�λ�� ��� �ַʵ�";
		std.showStudentInfo();
		
	}

}
