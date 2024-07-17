public class Person {
    private String jumin;
    private String passport;

    public Person() {
    }

    public Person(String jumin) {
        this.jumin = jumin;
    }

    public Person(String jumin, String passport) {
        this.jumin = jumin;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "jumin='" + jumin + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

    public void show(){
        System.out.println("주민번호 = " + jumin);
        System.out.println("여권번호 = " + passport);

    }
}
