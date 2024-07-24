//이제 제대로 입력 받아서 출력해보자
// chars 배열로 바꾸자!

//정규표현식 안 쓰고 풀이
import java.util.Arrays;
import java.util.Scanner;

public class Hw01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        System.out.println(Arrays.toString(arr));   // 한번 출력해봄

        System.out.print("파일명 : ");
        for (int i = 0; i < arr.length; i++) { // . 앞 부분 출력하는 구문
            if (arr[i] !='.') {
                System.out.print(arr[i]);
            }
            if (arr[i] == '.') {
                break;
            }
        }
        System.out.println();

        System.out.print("확장자 : ");
        for (int i = 0; i < arr.length; i++) {  //. 뒷 부분 출력하는 구문
            if (arr[i] == '.') {
                i++;
                for (int j = i; j < arr.length; j++) {
                    System.out.print(arr[j]);

                }
            }
        }
    }
}
