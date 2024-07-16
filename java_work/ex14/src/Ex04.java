class InstClass{

    static int num = 0;

    InstClass(){
        num++;
        System.out.println(num);

    }
}

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(InstClass.num);      //1번째 방법! 가장 좋은 방법이다!

        new InstClass(); // 2번째 방법
        new InstClass();
        new InstClass();
        new InstClass();

        InstClass in1 = new InstClass();
        System.out.println(in1.num);  //3 번째 방법
    }
}
