
public class Ex06 {
	public static void main(String[] args) {
		//3,4의 최소공배수
		
		for (int num = 1; num < 100; num++) {
			if(num%3==0 && num%4==0) {
			System.out.println("num = "+num);
			break; // break -> switch while for문 탈출
			}
		}
	}
}
