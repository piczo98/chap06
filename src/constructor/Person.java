package constructor;

public class Person {
	
	String name;
	float height;
	float weight;
	
//	생성자의 매개 변수의 타입이나 갯수가 다른 경우 => 생성자 오버로드
//	생성자의 주요 역할은 멤버 변수의 초기화
	public Person() {}	// 디폴트 생성자, 하나의 생성자도 없는 경우 컴파일러가 자도으로 생성
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;		
	}
	
	
	

}
