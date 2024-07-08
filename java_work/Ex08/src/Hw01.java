import java.util.Scanner;
import java.lang.Math;

public class Hw01 {
    //2의 n승을 구하는 함수를 재귀적으로 구현해 보자.
    //그리고 그에 따른 적절한 함수를 구현해 보자.
    //참고로 재귀 함수의 구현이 처음에는 어려운 편이기
    // 때문에 여기서는 쉬운 문제를 제시하였다.
    public static int jegob(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 * jegob(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jegob(n));
    }
}