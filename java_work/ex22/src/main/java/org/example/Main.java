package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] parr ={
                new Person("dddd",50),
                new Person("a",20),
                new Person("bb",30),
                new Person("ccc",40),

        };
        Arrays.sort(parr);

        System.out.println(Arrays.toString(parr));
    }
}