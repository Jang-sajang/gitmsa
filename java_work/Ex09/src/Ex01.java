
class A{
    int num = 20;
    public String doA(){
        System.out.println("doA 만들기");
        return "heloow";
    }
}
//class를 선언했다고 메모리에 올라가는건 아니다

public class Ex01 {
    public static void main(String[] args) {
        int num = 10;
        A a = new A();
        //이제 A안에 num과 do.A 쓸 수 있다

        System.out.println(a);
        System.out.println(num);
        System.out.println(a.num);
        a.doA();    //doA안에 메소드만 호출한다
        System.out.println(a.doA());  // doA만들기, hellow >> return 값 까지 돌려낸다


    }
}
//main은 넘어간다.