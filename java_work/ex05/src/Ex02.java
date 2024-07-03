import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();
			System.out.println("num = " + num);
			
			if(num==0) {
				System.out.println("종료됩니다");
				break;
				
				//break -> while문 탈출 / switch문 탈출
			}
		}
		
	}
}
