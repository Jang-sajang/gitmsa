package bank;

import java.util.Scanner;

//1. 가위 바위 보 게임을 만들어 보자.
//
//    사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
//    그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서
//    하나를 선택하게 한다.
//     이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
//    단 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
//    마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
// 가위 =1 바위 =2 보 =3
class ComRCP { // 컴퓨터의 가위바위보
    int victory = 0; // 승리 횟수
    int loose = 0; // 진 횟수
    int draw = 0;// 비긴 횟수

    public void RCPC() {// 내가 가위를 냈을 때의 가위바위보
        double comturn = (Math.random() * 3) + 1;
        int comRCP = (int) comturn;
        switch (comRCP) {
            case 1:
                System.out.println("컴퓨터가 가위를 냈습니다");
                System.out.println("비겼습니다");
                this.draw++;
                break;
            case 2:
                System.out.println("컴퓨터가 바위를 냈습니다");
                System.out.println("졌습니다");
                this.loose++;
                break;
            case 3:
                System.out.println("컴퓨터가 보를 냈습니다");
                System.out.println("이겼습니다");
                this.victory++;
                break;
            default:
                System.out.println("흐음!");
        }
    }

    public void RCPR() { // 내가 바위를 냈을 때의 가위바위보
        double comturn = (Math.random() * 3) + 1;
        int comRCP = (int) comturn;
        switch (comRCP) {
            case 1:
                System.out.println("컴퓨터가 가위를 냈습니다");
                System.out.println("이겼습니다");
                this.victory++;
                break;
            case 2:
                System.out.println("컴퓨터가 바위를 냈습니다");
                System.out.println("비겼습니다");
                this.draw++;
                break;
            case 3:
                System.out.println("컴퓨터가 보를 냈습니다");
                System.out.println("졌습니다");
                this.loose++;
                break;
            default:
                System.out.println("흐음!");
        }
    }

    public void RCPP() { // 내가 보를 냈을 따위 가위바위보
        double comturn = (Math.random() * 3) + 1;
        int comRCP = (int) comturn;
        switch (comRCP) {
            case 1:
                System.out.println("컴퓨터가 가위를 냈습니다");
                System.out.println("졌습니다");
                this.loose++;
                break;
            case 2:
                System.out.println("컴퓨터가 바위를 냈습니다");
                System.out.println("이겼습니다");
                this.victory++;
                break;
            case 3:
                System.out.println("컴퓨터가 보를 냈습니다");
                System.out.println("비겼습니다");
                this.draw++;
                break;
            default:
                System.out.println("흐음!");
        }
    }
}
public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComRCP rcp = new ComRCP();
        System.out.println("가위 바위 보를 5판 합니다!");
        System.out.println("무엇을 내겠습니까?");
        System.out.println("가위 / 바위 / 보 중에 하나를 낼 수 있습니다!");
        for (int i = 0; i < 5; i++) {

            String myturn = sc.next();
            if (myturn.equals("가위")) {
                rcp.RCPC();
                System.out.println("현재상황 = " + rcp.victory + "승");
            } else if (myturn.equals("바위")) {
                rcp.RCPR();
                System.out.println("현재상황 = " + rcp.victory + "승");
            } else if (myturn.equals("보")) {
                rcp.RCPP();
                System.out.println("현재상황 = " + rcp.victory + "승");
            } else {
                System.out.println("가위 바위 보 세가지 중에 골라주세요!");
                i--;
            }
        }
        System.out.println("총 결과는! = " + rcp.victory + " 승 " + rcp.draw + " 무 " + rcp.loose + " 패 ");
    }
}