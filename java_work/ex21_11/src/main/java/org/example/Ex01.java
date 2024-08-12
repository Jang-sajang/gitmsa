package org.example;

public class Ex01 {
    public static void main(String[] args) {

        int a = 10; // primitive 함수가 없다 (a.X)
        Integer b = Integer.valueOf(20); //wrapper 클래스 이기 때문에 함수 존재


        System.out.println(a);
        System.out.println(b);

        a = b; // unboxing 래퍼클래스가 기본자료형 타입으로 변환
    }
}
