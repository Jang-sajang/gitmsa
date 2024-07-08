import java.util.Scanner;

public class DD {
    // 1+2+3+4+ ~ 10 까지 더하는 메서드
    public static void doA(int end) {
        int sum = 0;
        for (int i = 0; i <= end; i++) {
            sum += i;
        }
        System.out.println("1부터 " + end + "까지 더한 수 = " + sum);
    }

    public static void doB(int end) {
        int integer = 1;
        for (int i = 1; i <= end; i++) {
            integer = i*integer;
        }
        System.out.println("1부터 " + end + "까지 곱한 수 = " + integer);
    }

    //1*2*3*4*5*6~10 까지 곱하는 메서드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇까지 더하고 곱할까요");
        int test = sc.nextInt();
        doA(test);
        doB(test);
    }
}
