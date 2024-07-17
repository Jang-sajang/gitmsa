//생성자 오버로딩
//오버로딩 : 메서드 생성자 이름이 같지만 파라메터가 다를 때 사용
// 결과값이 같은건 오류

public class Ex01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("987654-");
        Person p3 = new Person("987654-", "00001");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println();

        p1.show();
        p2.show();
        p3.show();
    }
}
