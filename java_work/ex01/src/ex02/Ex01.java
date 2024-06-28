package ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		double height;

		System.out.println("이름을 입력하세요 : ");
		name = scanner.next();
		System.out.println("안녕 " + name + " 만나서 반가워");
		System.out.println("나이는 몇살이야?");
		age = scanner.nextInt();
		System.out.println("그렇구나 " + age + "살이구나?");
		scanner.close();
	}

}
