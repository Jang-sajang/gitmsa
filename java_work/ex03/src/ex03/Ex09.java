package ex03;

public class Ex09 {

	public static void main(String[] args) {

		// and 연산자 &&
		// or 연산자 ||
		// not 연산자 !

		int num1 = 11;
		int num2 = 22;

		boolean result;

		result = 3 <= num1 && num1 <= 100;
		System.out.println(result);

		result = num1 % 3 == 0;
		System.out.println(result);

		result = num1 % 2 == 0;
		System.out.println(result);

		result = num1 % 3 == 0 && num1 % 2 == 0;
		System.out.println(result);
	}
}
