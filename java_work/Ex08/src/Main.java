public class Main {
    public static void main(String[] args) {
        //i=0 일때 0~0이하까지 =>1번
        //i=1 일때 0~1이하까지 =>2번
        //i=2 일때 0~2이하까지 =>3번
        //i=3 일때 0~3이하까지 =>4번
        //for (int i = 0; i < ; i++) 을  while로 바꾸려면
        // int i = 0;
        //while(i<10){
        // i++}                         요렇게 3줄로 나옴
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}