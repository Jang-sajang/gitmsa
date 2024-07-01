package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {

		// 두 수를 입력받아 곱과 나누기, 나머지를 구하시오...
		Scanner sc = new Scanner(System.in);

		System.out.println("곱셈과 나눗셈을 합니다 a와b 값을 입력하세요 A =");
		int a = sc.nextInt();
		System.out.println("B =");
		int b = sc.nextInt();

		System.out.println("곱한 값은 =");
		System.out.println(a * b); // 곱셈

		System.out.println("몫은 = " + (a / b) + "이고 나머지는 =" + a % b + "입니다"); // 나눗셈, 나머지

	}
}
