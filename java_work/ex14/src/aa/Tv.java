package aa;

public class Tv {
    String comp;
    int year;
    int inch;

    public Tv(){}
    public Tv(String comp, int year, int inch) {     // 클래스 안에 인수를 넣는다!!
        this.comp = comp;
        this.year = year;
        this.inch = inch;
    }

    public void show() { // 메소드에는 인수를 안 넣어도 된다
        System.out.println(comp + "에서 만든 " + year + "년형 " + inch + "인치 TV");
    }
}
