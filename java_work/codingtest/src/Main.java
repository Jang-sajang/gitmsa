import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        char chr = sc.next().charAt(0);
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += Integer.parseInt(String.valueOf(chr));
        }
        System.out.println(result);
    }
}