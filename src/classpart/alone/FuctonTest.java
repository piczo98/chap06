package classpart.alone;

public class FuctonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 30;
		int num2 = 20;
		System.out.println("두 수의 합 : "+ add(num1, num2));
		System.out.println("두 수의 차 : "+ subtract(num1, num2));
		System.out.println("두 수의 곱 : "+ division(num1, num2));
		System.out.println("두 수의 나누기 : "+ multiply(num1, num2));
	}

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	}
	public static int subtract(int n1, int n2) {
		int result = n1 - n2;
		return result;
		
	}
	public static double division(double n1, double n2) {
		double result = n1 / n2  ;
		return result;
		
	}
	public static int multiply(int n1, int n2) {
		int result = 0;	
		if (n2 != 0) {
			result = n1 * n2;
		}
		else
			System.out.println("비젯 수는 0이 아니여야 한다,");
		
		return result;
	}
}
