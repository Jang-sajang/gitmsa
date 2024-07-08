package ex06;

import java.util.Scanner;

public class Ex09 {

	
	public static int doA(int num) {
		return num * num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("곱하고 싶은 값 입력: ");
			int input = sc.nextInt();
			System.out.println(doA(input));
		}
	//여기 밑에 int return이 있어도 된다.	
	}
}
