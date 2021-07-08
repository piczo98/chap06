package classpart.alone;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();	// 새로운 인스턴스 생성
		System.out.println(person); 	// 인스턴스이 참조값 확인
		//인스턴스 변수 값 초기화 (참조 변수는 도트 연산자 [.]로 멤버 변수와 메서드에 접근 가능)
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person.name);
		System.out.println("결혼 여부 : " + person.isMarried);
		System.out.println("자녀 수 : " + person.numberOfChildren);
		
		
	}

}
