package org.example.aa;

//import lombok.AllArgsConstructor;
import lombok.ToString;
@ToString
//@AllArgsConstructor

public class Student {
    private String name;
    private int kor;
    private int eng;
    private int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
    public void getAverage(){
        System.out.println("평균 = " + (kor+eng+math)/3);
    }
    public void getTotal() {
        System.out.println("총합 = " + (kor + eng + math));
    }

}
