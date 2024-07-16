//person
class Person {
    private String name;
    private int age;

    public Person() {
    }       // 기본 생성자

    public Person(String name) {
        this.name = name;
    }

    //행동하는 메서드
    public void greeting() {
        System.out.println(name + " :  안녕하세요~");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//생성자(constructor)로 private 변수를 바꿀수있따
//setter로 private 변수를 밖루수 있다
//다른 생성자 선언시 기본생성자 생략 불가
public class Ex01 {
    public static void main(String[] args) {
        Person p1 = new Person();       //기본생성자 >> null 이름생성
        Person p2 = new Person("박길동");  // 박길동으로 다른생성
        p1.setName("홍길동");      // setname으로 p1 지정

        p1.greeting();
        p2.greeting();
        System.out.println(p1);
    }
}
