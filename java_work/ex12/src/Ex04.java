public class Ex04 {
    //기본생성자
    //toString()  생략되어있음
    Ex04(){
        System.out.println("기본생성자");
        doA();
    }
    public void doA(){
        System.out.println("doA 메서드 호출");
    }
    public static void main(String[] args) {

        new Ex04(); // Ex04 ex04 = new Ex04;
    }
}
