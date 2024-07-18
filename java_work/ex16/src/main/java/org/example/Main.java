package org.example;        //Maven으로 생성

import org.example.aa.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("홍길동",90,60,80);
        System.out.println(student);

    }
}