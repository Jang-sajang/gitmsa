
class A{}
/*
배열에서..
클래스 다형성 문법으로
Friend 클래스 배열로 친구관리를 할 수 있는 프로그램
오버라이드
    @Overide    부모클래스에서 존재하는 메서드를 재정의 할 때만 사용할 수 있음.
    toStiring 메서드

    Object는 항상 상속한다
    Object obj = new String();
    Object aa = new A(); 된다

    final 은 변수 상수에 붙음
    메서드.. 오버라이드 불가
    클래스.. 상속불가
 */
public class Ex03 extends Object{ // 모든 클래스는 오브젝트를 상속한다
    public static void main(String[] args) {
        A a = new A();

    }
}
