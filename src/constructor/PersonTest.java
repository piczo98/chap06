package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person person = new Person();	// 디폴트 생성자 : 클래스 이름과 같고 매개 변수는 없으며 반환 값이 없는 특수한 형태의 함수
		
		System.out.println(person); 	// 인스턴스 확인
		person.name = "홍길동";
		person.height = 180;
		person.weight = 75.5f;
		
		System.out.println(person.name+"님의 키는 "+person.height+"cm이고, 몸무게는 "+person.weight+"kg입니다.");
		
		Person personLee = new Person("이루마", 173.5f, 68.3f);
		System.out.println(personLee.name+"님의 키는 "+personLee.height+"cm이고, 몸무게는 "+personLee.weight+"kg입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
