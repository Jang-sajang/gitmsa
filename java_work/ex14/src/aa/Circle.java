package aa;

// static은 프로그램 메모리에 바로 적재된다 >>많으면 컴퓨터 터짐

public class Circle {
    public static final double PI = 3.1415;
    public static int a = 10;

    public void doRound(){
        System.out.println(2*PI*a);
    }
    public void doArea(){
        System.out.println(a*a*PI);
    }

    public int doA(){
        int sum = 0; // 메소드 안에 public은 안됨. 메소드가 퍼블릭이라
        for (int i = 0; i < 10; i++) {
            sum+=i;
        }
        return sum;
    }
}
