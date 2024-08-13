package org.example;

public class Person implements Comparable<Person>{

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


    @Override
    public int compareTo(Person o) {
        return this.name.charAt(1) - o.name.charAt(1);
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.name.length() - o.name.length();
//    }


}
