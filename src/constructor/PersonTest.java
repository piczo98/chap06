package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person person = new Person();	// ����Ʈ ������ : Ŭ���� �̸��� ���� �Ű� ������ ������ ��ȯ ���� ���� Ư���� ������ �Լ�
		
		System.out.println(person); 	// �ν��Ͻ� Ȯ��
		person.name = "ȫ�浿";
		person.height = 180;
		person.weight = 75.5f;
		
		System.out.println(person.name+"���� Ű�� "+person.height+"cm�̰�, �����Դ� "+person.weight+"kg�Դϴ�.");
		
		Person personLee = new Person("�̷縶", 173.5f, 68.3f);
		System.out.println(personLee.name+"���� Ű�� "+personLee.height+"cm�̰�, �����Դ� "+personLee.weight+"kg�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
