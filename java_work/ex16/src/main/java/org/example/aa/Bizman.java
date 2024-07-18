package org.example.aa;

public class Bizman extends Man{
    //부모클래스의 생성자를 무조건 적어줘야 한다
    private String company;
    private String position;

    public Bizman(String name, String company, String position){
        super(name); // 부모클래스의 생성자를 호출
        this.company = company;
        this.position = position;
    }

    public void showInfo(){
        System.out.println("company = "+company);
        System.out.println("position = "+position);

        tellInfo();
    }
}
