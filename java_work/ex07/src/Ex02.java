public class Ex02 {
    public static void main(String[] args) {
        //Math.random() 을 사용해서 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램
        int value = 6;
        for (int i = 0; i < 10; i++) {
            double num1 =  (Math.random()*6)+1;
            double num2 =  (Math.random()*6)+1;
            int dice1 = (int)num1;
            int dice2 = (int)num2;
            value = dice1 + dice2;
            if (value==6){
                System.out.println("\n"+dice1 + " + " + dice2 + "  총합 = " + (dice1+dice2));
            } else {
                System.out.print("꽝  ");
            }
        }
// 하긴 했다. 근데 다이스 값이 1~10이여서 >> 1~6으로 바꿔야 한다.
// 오케이! 랜덤값에 대해서 이해가 필요하다!
// Math.random() 랜덤값 = 0.000000001 ~ 9.9999999999 이다. 이걸 1~6으로 바꾸자
// 오케이 이해완료
//
        System.out.println("value = " + value);
}
}