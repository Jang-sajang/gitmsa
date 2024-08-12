package org.example;


//comparable compareTo 사용해야 한다.(여기에 이름순으로 정렬하라하면 안됨)
//person 클래스를 배열로 가져오려면
public class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
//        System.out.println("this = " + this);
//        System.out.println("this.age = " + this.age);
//        System.out.println("Person(o) " + (Person)o);
//        System.out.println(((Person)o).age);
//        if (this.age > ((Person) o).age) {
//            return 1;
//        } else if (this.age < ((Person) o).age) {
//            return -1;
//        } else {
//            return 0;
//        }
//        return this.age - ((Person)o).age;  // (Person)o 는 o.age를 peron으로 형변환을 한다는 것임
        return this.age - ((Person)o).age;
    }
}