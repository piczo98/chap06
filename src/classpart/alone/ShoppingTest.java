package classpart.alone;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shopping shopping = new shopping();
		
		shopping.num = 201803120001L;
		shopping.id = "abc123";
		shopping.date = "2018월 3월 12일";
		shopping.name = "홍길동";
		shopping.itemNum = "PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : "+ shopping.num);
		System.out.println("주문자 아이디 : "+ shopping.id);
		System.out.println("주문 날짜 : "+ shopping.date);
		System.out.println("주문자 이름 : "+ shopping.name);
		System.out.println("주문 상품 번호 : "+ shopping.itemNum);
		System.out.println("배송 주소 : "+ shopping.address);
		
		
	}

}
