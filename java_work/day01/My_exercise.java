package day01;

import javax.sound.sampled.SourceDataLine;

/**
 * My_exercise
 */
class Animal {
    // 속성(변수)
    String color;
    short power;

    // 기능(메소드)
    void move() {
        System.out.println("움직입니다");
        power--;
    }

    void eat() {
        System.out.println("먹습니다");
        power++;
    }
}

public class My_exercise {
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.color = "orange";
        lion.power = 10;
        lion.eat();
        
        System.out.println("Lion's color: " + lion.color);
        System.out.println("Lion's power: " + lion.power);
    }
}