package ex06;

import java.util.Scanner;

public class Ex10 {
	
	public static void doA() {
		System.out.println("doA 함수 호출");
	}
	public static void doB() {
		System.out.println("doB 함수 호출");
	}
	
	public static void main(String[] args) {
		
		//제어문
		//1번을 입력 doA 함수
		// 2번을 입려하면 doB함수 호출
		
		Scanner sc = new Scanner(System.in);
		int Select = sc.nextInt();
		 if(Select ==1) {doA();}
		 else {doB();}
	}
}
