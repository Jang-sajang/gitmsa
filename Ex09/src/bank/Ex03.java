package bank;

class AA{   // 참조변수
    int count = 10;
}

public class Ex03 {
    public static void main(String[] args) {
    AA a1 = new AA();
    AA b1 = a1;  // 이건 b1이 a1의 값을 참조함. 같은 공간이다!
                    // new 라는 것을 써야 새로 생성된다. (새 인스턴스)

        System.out.println(a1.count);
        System.out.println(b1.count);

        b1.count =30;

        System.out.println(a1.count);
        System.out.println(b1.count);

        int a = 10;
        int b = a; // a값을 가리키는게 아니라 a값이 b값에 들어와서 생성!

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b=20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}