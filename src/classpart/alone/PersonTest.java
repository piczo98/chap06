package classpart.alone;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();	// ���ο� �ν��Ͻ� ����
		System.out.println(person); 	// �ν��Ͻ��� ������ Ȯ��
		//�ν��Ͻ� ���� �� �ʱ�ȭ (���� ������ ��Ʈ ������ [.]�� ��� ������ �޼��忡 ���� ����)
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("���� : " + person.age);
		System.out.println("�̸� : " + person.name);
		System.out.println("��ȥ ���� : " + person.isMarried);
		System.out.println("�ڳ� �� : " + person.numberOfChildren);
		
		
	}

}
