import java.util.Scanner;

class Fact{
    public int fact(int num){
        System.out.println("여기오나");
        //메소드는 반환값을 적게 되면 반환값이 무조건 있어야 한다.
        if (num > 0) {
            return 2 * fact(num-1);
        }else return 1;
    }
}


public class Main {
    public static void main(String[] args) {
        // String -> int      =     Integer.pareInt
        // int  ->  String    =    10 + ""
        //문자열 입력 scan.nextLine 숫자 입력 scan.nextInt

        Scanner sc = new Scanner(System.in);
        System.out.println("How many you want?");

        String a = sc.next();
        int num = Integer.parseInt(a);
        //int num = scanner.nextInt

        Fact fact = new Fact();
        fact.fact(num);
    }
}