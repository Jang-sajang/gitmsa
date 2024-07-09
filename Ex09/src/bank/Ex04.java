package bank;

class CC {
    public void doA(BB b) {
        System.out.println("b.num = " + b.num);
    }
}

class BB {
    int num = 10;
}

public class Ex04 {
    public static void main(String[] args) {

        BB bb = new BB();
        CC cc = new CC();

        cc.doA(bb);
        System.out.println("bb.num = " + bb.num);
        bb = null;
    }
}
