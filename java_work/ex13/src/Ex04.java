public class Ex04 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(2);

//        circle1.rad = -10;
//        circle2.rad = 20;
        circle1.setRad(-10);
        circle2.setRad(10);
        System.out.println(circle1.getRad());
        System.out.println(circle2.getRad());

        System.out.println();

    }
}
