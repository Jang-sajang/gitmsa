package Mypage;

class Circle{
    private int rad;  //반지름

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad < 0){
            this.rad = 0;
            return;
        }
        this.rad = rad;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        circle1.setRad(-2);
        System.out.println(circle1.getRad());
        circle1.setRad(10);
        System.out.println(circle1.getRad());
    }
}
