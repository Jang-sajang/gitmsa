package org.example.inter;
//interface 를 상속받으면 implements 하면 받은 변수요소는 재정의 해야한다
public interface Printable {
    //static final 변수는 대문자로 짓는게 관례...

    public static final int HEIGHT = 70;  // public static final 은 생략!가능
    int WIDTH = 120;

    public void print(String mydoc); // public 생략

    default void clean(){       // default 추가하면 계쏙 재정의 안하고 여기서 몸체를 붙여준다!
        System.out.println("청소기능 추가"+" 쓱싹 쓱싹");
    }
    static void printLine(){        // Printable.으로 호출해서 메소드 사용가능
        System.out.println("한줄 출력할때 줄 바꿈...");
    }
}
