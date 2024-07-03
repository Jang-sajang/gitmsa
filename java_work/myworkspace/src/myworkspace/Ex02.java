package myworkspace;
import java.util.Scanner;

public class Ex02 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("소수점의 숫자를 입력하세요 :");
	double a = sc.nextDouble();  //10.987 입력
	
	a = a*100;  //1098.7
	a -= a%1;	//소수점 제거
	a = a/100;	//나누기 100
	System.out.println(a);
	
	
}
}
