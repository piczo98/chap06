package classpart.alone;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shopping shopping = new shopping();
		
		shopping.num = 201803120001L;
		shopping.id = "abc123";
		shopping.date = "2018�� 3�� 12��";
		shopping.name = "ȫ�浿";
		shopping.itemNum = "PD0345-12";
		shopping.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+ shopping.num);
		System.out.println("�ֹ��� ���̵� : "+ shopping.id);
		System.out.println("�ֹ� ��¥ : "+ shopping.date);
		System.out.println("�ֹ��� �̸� : "+ shopping.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+ shopping.itemNum);
		System.out.println("��� �ּ� : "+ shopping.address);
		
		
	}

}
