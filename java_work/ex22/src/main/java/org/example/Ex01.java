package org.example;

//자바에서 선언반법
//const obj = {};
// const obj = new object{};

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();

        Box<String> box3 = new Box();

        Box<Scanner> Box4 = new Box<>();
        Box<StringTokenizer> box5 = new Box<>();
        Box<Random> box6 = new Box<>();

        box1.setObj(new Apple());
        box2.setObj(new Orange());

        box3.setObj("apple");
//        box3.setObj(new apple()); String 만 넣도록 함
        Apple apple = box1.getObj();
        Orange Orange = box2.getObj();


        String a = """
                여러줄 %d
                적을수 %d <formatted 로 적은 숫자
                있다.. 자바17버전부터
                """.formatted(10,20);


    }
}
