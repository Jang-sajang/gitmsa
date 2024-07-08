package ex06;
//6장 = 메소드의 이해와 변수의 스코프
public class Ex05 {
	
	//구구단 출력하는 메서드
	public static void aa(int dan) {
		System.out.println("aa");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan*1);
		}
	}
	
	public static void bb(int num1, int num2) {
		System.out.println("bb");
		int num = 0;
		while(num<50) {num++; System.out.println(num);}
	}
	
	public static void main(String[] args) {
		System.out.println("======START======");
		aa(5);
		bb(3,4);
		System.out.println("=======End=======");
	}
}
