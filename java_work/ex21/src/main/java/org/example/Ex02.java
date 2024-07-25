package org.example;

public class Ex02 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Point p1 = new Point(10,20);
//        Point p2 = new Point(p1.getXpos(),p1.getYpos());
        Point p2 = (Point) p1.clone(); // 위에거 쓸 수도 있는데 -> 백개가 넘어가면 이게 낫다

        p1.showPoint();
        p2.showPoint();

        p1.setYpos(30);
        p1.setXpos(20);

        p1.showPoint();
        p2.showPoint();
    }
}
