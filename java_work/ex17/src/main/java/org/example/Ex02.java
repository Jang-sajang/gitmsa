package org.example;

import org.example.test.AA;
import org.example.test.BB;
import org.example.test.CC;

public class Ex02 {
    //springboot 프레임워크 미국애들이 잘 만들어놓음. 외에 잘 안씀
    //부모클래스에 자식클래스를 담을 수 있다
    //자식클래스 생성했을때 부모클래스로 참조 할 수 잇따.
    public static void main(String[] args) {
        BB[] bary = new BB[10];
        CC[] cary = new CC[10];

        AA[] arry1 = new BB[10];
        AA[] arry2 = new CC[10];

        AA a1 = new BB();
        AA a2 = new CC();
    }
}
//부모클래스에 있는 메소드는 상속되며
//자식클래스에 동일한 이름에 메소드가 있으면
//오버라이딩(재정의) 된다
// 오버플로우... 오버로딩.. 오버라이딩.. 면접에서 많이 묻는다고? 함