package bank;

public class BankAccountMain {

    public static void main(String[] args) {
        System.out.println("시작");

        BankAccount park = new BankAccount();
        BankAccount yoon = new BankAccount();

        park.cmb();
        yoon.cmb();
        System.out.println();

        park.deposit(3000);
        yoon.deposit(4000);

        park.cmb();
        yoon.cmb();

        park.withdraw(1000);
        yoon.withdraw(1000);
        park.cmb();
        yoon.cmb();
        System.out.println();

        System.out.print("끝");
    }
}
