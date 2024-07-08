package ex06;

//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
public class Hex1 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 20; i++) {
			if ((i % 2 == 0 || i % 3 == 0) == false) {
				System.out.println(i);
				sum = i + sum;
				
			}
			
		}
		System.out.println("총 합은 : " + sum);
	}

}
