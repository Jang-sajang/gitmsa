//1. Student 클래스를 작성하는 연습을 해보도록하자.
//    Student클래스에 getTotal() getAverage() 과 를 추가하시오
//    1. :  getTotal 메서드
//    기 능 국어 영어 수학 의 점수를 모두 더해서 반환한다 :
//        (kor), (eng), (math) .
//        반환타입 : int
//        매개변수 없음 :
//    2. : getAverage 메서드
//    기 능 총점 국어점수 영어점수 수학점수 을 과목수로 나눈 평균을 구한다 : ( + + ) .
//    소수점 둘째자리에서 반올림할 것.
//    반환타입 : float
//    매개변수 없음

public class Hw01 {
    public static void main(String[] args) {
        Student st = new Student();
        st.getTotal(74,86,99);
        System.out.println(st.getAverage());
    }
}

class Student {
    int kor;
    int eng;
    int math;
    float sum;


    public void getTotal(int kor, int eng, int math){
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        int sum = kor + eng + math;
        this.sum = sum;

        System.out.println("총 점은 = " + sum);
    }

    public float getAverage(){      //평균을 구하고 둘째자리에서 반올림
        float result = (float) Math.round((sum/3)*100)/100;
        return result;

    }
}
