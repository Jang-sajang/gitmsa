package ex06;

//2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오
public class Hex2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				// System.out.println("i는 : " + i);

				sum = sum + j;
				System.out.print(j + " +");
			}
			System.out.println("");
		}
		System.out.println("총 합은 = " + sum);
	}

}
