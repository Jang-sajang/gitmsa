class Circle {
    //getter setter
    private int rad;            // 반지름에 음수를 못 넣도록 함! 여기에 직접 접근 불가
    private String name;

    //기본생성자 생략가능..
    //다른 생성자 선언시 기본생성자 생략불가..


    public Circle(int rad) {
        this.rad = rad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "홍길동";
            return;    //void 도 return이 있을 수 있긴하다! 값이 없을뿐
        }
        this.name = name;
    }

    public void setRad(int r) {           // 이 함수를 통해서만 반지름을 넣어라
        if (r < 0) {
            rad = 0;
            return; //리턴은 함수 강제종료!! 밑에 루프를 수행하지 않는다
        }
        rad = r;
    }

    public int getRad() {
        return rad;
    }

    public double getArea(){
        return 3.14*rad*rad;
    }
}
