import java.util.Scanner;

public class Hw02 {
    //2. 프로그램 사용자로부터 초(second)를 입력받은 후에,
    // 이를 [시, 분, 초]의 형태로 출력하는 프로그램을 작성해 보자.


    public static int MtoS(int num) {
       return num/60;
    }
    public static int HtoS(int num) {
       return num/3600;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int second = sc.nextInt();
            System.out.println(second/60 + " 분 "+ second%60 + " 초 ");
            System.out.println( HtoS(second)+ " 시간 " +MtoS(second) + " 분 "+ second%60 + " 초 " );
        }
    }
