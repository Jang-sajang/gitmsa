// 두개의 주사위 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
// Math.random을 이용해서 1~6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하여라.
// 1)에 맞는 코드를 넣으세요
// 1, 2 번 다 풀었으면 1,2번 문제를 함수로.... 해주세요

public class GG{
    public static void main(String[] args) {
        int value = 0;
        //1~6까지만 담기 MAX , MIN
        for (int i = 0; i < 50; i++) {
            double value1 = Math.random(); // 0~1 의 숫자를 value1에 담음
            if( 1 <=value1 && value1<= 6){
                System.out.println(value1);
            }else continue;
        }
    }
}
