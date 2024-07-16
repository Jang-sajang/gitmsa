class Test{
    public static void doA(){
        System.out.println("static doA");

    }
    public void doB(){
        System.out.println("일반 doB");
    }
}

public class Ex06 {
    int num = 0;
    static void Add(int n){
       // num+=n; // static 내에서는 static 사용 가능. 일반 인스턴스 int 는 참조불가. num은 메모리에 없으니 항상있는 static에 사용 불가
    }
    public static void main(String[] args) {
//        Test.doA();
////        Test.doB(); >> no
//        Test test = new Test();
//        test.doB();
//        test.doA(); // 되긴된다 근데 안좋은 방법!
//        // 완전 많이 참조하는 경우 static이 더 좋을 수 있따
    }

}
