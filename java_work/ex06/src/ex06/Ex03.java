package ex06;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = n; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}
