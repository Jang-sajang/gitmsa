// 10진수를 2진수로 바꾸는 코드

import java.util.Scanner;

    class Exam{         //클래스는 데이터(속성, 변수, 필드)와 메서드(인스턴스, 함수)로 이루어져 있다.
    Scanner sc = new Scanner(System.in);

        public int inputNumber(){
            System.out.println("숫자 입력");
            int inputNumber = sc.nextInt();
            System.out.println(inputNumber);
            return inputNumber;      //리턴을 써야 메인에서 사용 가능
        }
    }

public class Main {
    public static void main(String[] args) {
        Exam exam = new Exam();
        int result = exam.inputNumber();  // 값을 담는것은 return 을 사용해서 받아줘야 한다.
        System.out.println("main.result = "+result);

        int 몫, 나머지;
        몫 = result/2;
        나머지 = result%2;

        System.out.println("몫 = " + 몫);
        System.out.println("나머지 = " + 나머지);

        String 나머지들 = ""+나머지;       // 나머지들 == 맨 앞에 숫자 빼고 이진수로 표현됨 10 >> X010

        while(true){
            나머지 = 몫%2;
            몫 = 몫/2;
            나머지들 = 나머지 + 나머지들;
//            System.out.println("몫 = " + 몫);
//            System.out.println("나머지 = " + 나머지);
//            System.out.println("나머지들 = " + 나머지들);

            if (몫<2){
                if (몫 !=0){
                    나머지들 = 몫 + 나머지들;
                    System.out.println("2진수 = " + 나머지들);
                }
                break;
            }

        }

    }
}