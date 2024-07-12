//1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
//홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
//일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
//        단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
//배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는
// 함수를 각각 정의해서
//이 두 함수를 호출하는 방식으로 프로그램을 완성하자.

import java.util.Scanner;

public class Hw1 {
 static Sort sort = new Sort();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [9];  //10개 배열 생성
        for (int i = 0; i < arr.length; i++) { //10개 배열 입력받음
            arr[i] = sc.nextInt();
            System.out.println(sort.even(arr[1]));
        }
    }
    public static class Sort {
        //  메인 클래스의 num 상속 하는법?

        public void odd(int n) {
            for (int i = 0; i < 9; i++) {
                if (0 != (n % 2)) {
                    System.out.println("값은 =" + n + "    홀수네요!");
                }
            }
        }

        public void even(int n) {
            for (int i = 0; i < 9; i++) {
                if (n % 2 == 0) {
                    System.out.println("값은 =" + n + "    짝수네요!");
                }
            }
        }
    }
}


