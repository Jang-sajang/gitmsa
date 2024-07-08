public class BankAccountMain {


    public static void main(String[] args) {
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();

        // 참조 변수 출력할때.. toString은 생략가능
        // 원래는 주소값 16진수가 나오는데 toString은 내가 다시 정의 할 수 있다.

        System.out.println("a 참조변수 = " + a);
        System.out.println("b 참조변수 = " + b);
        a.mod();
        System.out.println("a 참조변수 = " + a);
        System.out.println("b 참조변수 = " + b);
    }
}
