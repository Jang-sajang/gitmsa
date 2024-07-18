package org.example.aa;

public class Man {

    private String name;
//상속관계에서는 부모클래스 생성자는 무조건 호출 되어야함.
    //기본생성자일ㄸ는 super 생략가능 다른은 안됨
//기본생성자는 다른생성자를 선언하게 되면 생략 불가
//상속관계에서는 기본생성자를 호출하는게 있는데. 생략되어져 있음
//만약 부모클래스에 기본생성자 없을시, 다른생성자 통해 부모클래스 생성자 호출 가능
    public Man(){}      // 기본생성자가 있으면 자식클래스에 super()가 없어도 에러 아니다

    public Man(String name){
        this.name = name;
    }

    public void tellInfo(){
        System.out.println("name = " + name);
    }
}
