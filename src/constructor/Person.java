package constructor;

public class Person {
	
	String name;
	float height;
	float weight;
	
//	�������� �Ű� ������ Ÿ���̳� ������ �ٸ� ��� => ������ �����ε�
//	�������� �ֿ� ������ ��� ������ �ʱ�ȭ
	public Person() {}	// ����Ʈ ������, �ϳ��� �����ڵ� ���� ��� �����Ϸ��� �ڵ����� ����
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;		
	}
	
	
	

}
