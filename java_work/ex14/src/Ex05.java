import aa.Circle;

public class Ex05 {

    public static void main(String[] args) {

        System.out.println(Circle.PI);

        Circle c = new Circle();
        int result = c.doA();

        c.doRound();  //호출 할 때 메모리화 된다.
        c.doArea();

        System.out.println(result);
    }
}
