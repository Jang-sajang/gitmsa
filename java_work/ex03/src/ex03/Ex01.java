package ex03;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ctrl + d 한줄삭제
		//ctrl + f11
		System.out.println("두 값을 입력 받아 더합니다. A값을 입력하세요 :");
		int a = sc.nextInt();
		System.out.println("B값을 입력하세요 :");
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
}
