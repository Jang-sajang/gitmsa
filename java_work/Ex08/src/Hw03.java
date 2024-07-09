import java.awt.*;
import java.util.Scanner;

public class Hw03 {

    //필자가 좋아하는 것 중 하나가 금요일 저녁 퇴근길에 DVD나 만화책을 잔뜩 빌리고,
    //동네 슈퍼에 들러서 군것질거리를 사 가지고 집에 들어가는 것이다.
    //오늘은 금요일이다. 현재 필자의 주머니에는 5천 원이 있다.
    //DVD 한 편을 빌리면 3,500원이 남는다.
    //슈퍼에 들려서 크림빵(500원), 새우깡(700원), 콜라(400원)를 사려한다.
    //잔돈을 하나도 남기지 않고 이 세 가지 물건을 하나 이상 반드시 구매하려면
    //어떻게 구매를 진행해야 하겠는가? 물론 여기에는 여러 가지 경우의 수가 있을 것이다.
    //
    //필자가 어떠한 선택을 할 수 있는지 여러분이 제시해 주기 바란다.

    public static void main(String[] args) {
        int money = 3500;
        //크림빵2개 새우깡 3개 콜라 1개 = 1000 2100 400 = 3500

        int creamBread = 500;
        int shrimp = 700;
        int cola = 400;

        System.out.println("안녕하세요! 그린슈퍼에 오신것을 환영합니다~!" + '\n');
        System.out.println("==========메뉴==========");
        System.out.println("크림빵 500원");
        System.out.println("새우깡 700원");
        System.out.println("콜 라 400원");
        System.out.println("==========메뉴==========");
        System.out.println(" 3500원 있습니다. 메뉴를 골라주세요! " + '\n');

        money = money - Buy(creamBread);
        System.out.println("크림빵 구매!  잔액은 =  "+money );
        money = money - Buy(creamBread);
        System.out.println("크림빵 구매!  잔액은 =  "+money);
        money = money - Buy(shrimp);
        System.out.println("새우깡 구매!  잔액은 =  "+money);
        money = money - Buy(shrimp);
        System.out.println("새우깡 구매!  잔액은 =  "+money);
        money = money - Buy(shrimp);
        System.out.println("새우깡 구매!  잔액은 =  "+money);
        money = money - Buy(cola);
        System.out.println("콜라 구매!  잔액은 =  "+money);

    }

    public static int Buy(int num) {
        return num;
    }
}