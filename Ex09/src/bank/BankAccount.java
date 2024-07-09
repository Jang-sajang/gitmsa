package bank;

public class BankAccount {
    int balance = 0;

    public int cmb(){
        System.out.println("잔액 = " + balance);
        return balance;
    }

    public void deposit(int a){
        balance = balance + a;
    }
    public void withdraw(int a){
        balance = balance - a;
    }
}
