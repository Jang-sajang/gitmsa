package ex04;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	//숫자를 입력받아 10 미만이면 미만출력 / 
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력받아 범위를 지정하는 프로그램입니다");
	int num1 = sc.nextInt();
	
	if(num1<10) {System.out.println("10미만입니다");}
	else if(10<=num1 && num1<20) {System.out.println("10이상 20미만입니다");}
	else {System.out.println("20이상입니다");}
}
}
