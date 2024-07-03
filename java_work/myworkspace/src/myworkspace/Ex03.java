package myworkspace;
import java.util.Scanner;
//값을 입력받아 정수와 소수점을 분리하는 프로그램 만들기

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수의 정수값과 소수점을 분리하는 프로그램을 만듭니다." + '\n' +"값을 입력해주세요 : " );
		double num = sc.nextDouble();
		int a = (int)num ; // 정수
		double b = num%1;  // 소수점
		
		System.out.println("정수 자리는 : "+a);
		System.out.printf("소수점자리는 : %.2f 입니다!",b);
	}

}
