package org.example;

class MyBox<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        MyBox<Integer> myBox1 = new MyBox<>();
//        MyBox<String> myBox2 = new MyBox<>(); //extends Number 추가 시 부모클래스가 Number클래스만 가능

    }
}
