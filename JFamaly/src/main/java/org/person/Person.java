package org.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(){
        name = "Неизвестный";
        age = 0;
        gender = "М";
    }
    public Person(String name){
        this();
        this.name = name;
    }
    public Person(String name, int age){
        this();
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
