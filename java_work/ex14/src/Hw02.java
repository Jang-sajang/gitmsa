//2. 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//
//    public static void main(String[] args) {
//        TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
//        myTV.show();
//    }
//
//    출력
//    LG에서 만든 2017년형 32인치 TV

public class Hw02 {
    public static void main(String[] args) {
        Tv myTv = new Tv("LG", 2017, 32); //LG에서 만듬 2017년 32인치
        myTv.show();
    }


    public static class Tv {
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

}
