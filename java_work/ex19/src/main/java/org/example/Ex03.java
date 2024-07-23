package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(" a :  ");
            int a = sc.nextInt();
        System.out.println(" b : ");
            int b = sc.nextInt();
            System.out.println("====나누기 시작====");
            System.out.println(a/b);
            System.out.println("나누기 끝");

        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//           e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다!");
        }catch(InputMismatchException ie){
            System.out.println("문자를 입력할 수 없습니다");
        }catch(Exception p){
            System.out.println("이것은 모든 예외 상황");
        }


        System.out.println("====종료====");
    }
}
/*
그냥 정리
interface
void doA(); 몸체가 없는 메서드. public 안 적어도 됨
intA 변수에 public static final 생략가능

class 만들어서 interface 상속 받아야 함
doA() 매서드 재 정의

default() static() 추가 가능
메서드 안에 내용이 존재할 수 있음

디폴트 스태틱 차이
default() -> new... 사용해도 되는 것
static() -> PRINTABLE.doA();

람다 규칙은
interface 하나의 추상메서드가 존재 해야한다.
() -> {} 형식으로 사용

도커 데스크탑
데이터베이스 종류 많음.
MYSQL server 설치. 직접 설치 하지 않고
가상OS docker run 명령어 설치
heidsql 클라이언트 프로그램으로 접속
자바 언어로도 접속 예정18장
try{} catch{}예외사항에 대해서 학습중
 */