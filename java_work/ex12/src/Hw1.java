//1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
//    2.숫자로 이루어진 문자열 이 있을 때 각 자리의 합을 더한 결과를 출력하는 코 str ,
//드를 완성하라 만일 문자열이 라 . "12345" 면 의 , ‘1+2+3+4+5’ 결과인 를 출력이 출력되 15
//어야 한다 에 알맞은 코드를 넣으시오 . (1) .
//
//        [Hint] String charAt(int i) 클래스의 을 사용
//
//    3.프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음, 이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
//
//        4. 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성해보자
//예)
//입력 abcdef
//출력 fedcba
//
//입력 안녕하세요
//출력 요세하녕안
//     */

public class Hw1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum =0;
        int standard =0;
        for(int e : arr){
            System.out.println(e);
            sum = sum + e;
        }
        System.out.println("총 합은 = " + sum);
        System.out.println("평균은 = " + sum/arr.length);
    }
}
