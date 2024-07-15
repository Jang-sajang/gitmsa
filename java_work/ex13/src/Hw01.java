import java.util.Scanner;
//1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//    제한사항 1<= str의 길이 <=10
//    입력 #1
//    abcde
//    출력
//    a
//    b
//    c
//    d
//    e
public class Hw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요!");

        String str = sc.next();
        if( str.length() <= 10) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        } else {
            System.out.println("1~10까지 입력하세요!");
        }
}
}