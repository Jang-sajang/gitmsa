import java.util.Scanner;

public class Myex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];  // 10개 배열 생성

        for (int i = 0; i < arr.length; i++) { // 10개 배열 입력받음
            arr[i] = sc.nextInt();
        }

        Sort sort = new Sort(); // Sort 클래스의 인스턴스 생성

        for (int i = 0; i < arr.length; i++) {
            sort.even(arr[i]); // 짝수 여부 출력
            sort.odd(arr[i]);  // 홀수 여부 출력
        }
    }

    public static class Sort {
        public void odd(int n) {
            if (n % 2 != 0) {
                System.out.println("값은 " + n + "    홀수네요!");
            }
        }

        public void even(int n) {
            if (n % 2 == 0) {
                System.out.println("값은 " + n + "    짝수네요!");
            }
        }
    }
}
