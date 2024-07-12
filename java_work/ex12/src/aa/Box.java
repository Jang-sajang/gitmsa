package aa;

public class Box {
    String name;
    int count;

//        // 기본생성자는 생략가능 하지만
//        // 다른생성자를 선언할시 생략 불가
//    }
//원래 toString = 주소값 출력  / 그걸 우리가 바꿔준것임

    public Box() {
        System.out.println("기본 생성자 호출");
    }      // 변수지정 생성자가 있으면 기본도 있어야함

    public Box(String n) {         // 이것만 있으면(기본 없으면) 오류
        name = n;
        System.out.println("다른 생성자 호출");
    }
    public Box (String n, int c){
        name = n;
        count = c;
        System.out.println("n c ");
    }
//        //개발자 프로그래머가 직접 적게되면 내용이 바뀐다
    public String toString(){
            return "Box name =" + name;
    }


    //메소드 이름이 동일 할 수 없다
    public void doA() {
    }

    public void doA(String a) {
    }
}