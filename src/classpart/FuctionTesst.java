package classpart;

public class FuctionTesst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 200;
		
		int sum = add(num2, num1);
		System.out.println(num1);
		System.out.println(num1+ " + " +num2 + "= " +sum);
	
		System.out.println("1부터 10까지의 합 :"+getTotal());
		
	}
	public static int getTotal() {
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		return total;
	}

	public static int add(int num2, int num1) {
		// TODO Auto-generated method stub
		int result = num1 + num2;
		return result;
		
	}

}
