//hello.java 문자열에서 파일명은 hello와 확장자인 java를 분리시켜 보자.
//입력 HELLO.JAVA
//출력
//파일명 HELLO
//확장자 JAVA
// ==============완료==================

public class Hw01 {
    public static void main(String[] args) {
        String[] str = {"H", "e", "l", "l", "o", ".", "j", "a", "v", "a"};

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
