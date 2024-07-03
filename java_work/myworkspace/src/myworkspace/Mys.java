package myworkspace;

import java.util.Scanner;

public class Mys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕 네 이름은 뭐야?");
		String name = sc.next();
		System.out.println("안녕!" + name + "! 무슨 일이야?" +'\n' +"1 : 어.. 누구더라?"+'\n' +"2 : 어 반갑다! 언제 밥이라도 먹자!"+'\n' +"3 : 뭘봐" );
		int num = sc.nextInt();

		switch(num) {
		case 1:
			System.out.println("나 혁수잖아!");
			break;
		case 2:
			System.out.println("그래!");
			break;
		case 3:
			System.out.println("...;");
			break;
		default:
			System.out.println("뭐라고?");
			
		}
		System.out.println("늦었네 그럼 잘가~");
	}
}
