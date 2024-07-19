package org.example.phone;

public class SmartPhone extends MobilePhone{

    private String androidVer;

    public SmartPhone(String aver, int number) {
        super(number);
        this.androidVer = aver;
    }
    public void show(){//오버라이딩! 상속받은걸 재정의한다
        System.out.println("androidVer = " + androidVer);
//        System.out.println("numver = " + number);

    }
}
