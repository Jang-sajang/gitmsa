//이제 제대로 입력 받아서 출력해보자

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Hw01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[]{sc.next()};
        System.out.println(Arrays.toString(str));

        System.out.print("확장자 ");
        for (int i = 0; i < str.length; i++) { // . 앞으로 출력하는 구문
            if (str[i] != ".") {
                System.out.print(str[i]);
            }
            if (str[i] == ".") {
                break;
            }
        }
        System.out.println();
        System.out.print("파일명 ");
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ".") {
                i++;
                for (int j = i; j < str.length; j++) {
                    System.out.print(str[j]);

                }
            }
        }
    }
}
