// 3. 프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음,
// 이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
//미완
import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println("10진수를 2진수로 변환합니다! 입력 해주세요! : ");
        System.out.println("입력 해주세요! : ");
        int num;
        int remV;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] twoN = new int[4];         // 0000 배열 만듬

        for (int i = 0; i < 4; i++) {
            while(1 < num){
                remV = num%2;
                num = num/2;
                twoN[3-i] = remV;         // 0001 에 넣어지나?
                System.out.print(remV);

            }if(num==1){
                System.out.println("1");
   //             twoN[3] = remV;
                break;
            }

        }
        System.out.println(Arrays.toString(twoN));
    }
}