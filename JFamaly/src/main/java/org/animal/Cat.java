package org.example;

public class Cat extends Animal {
    private String name;
    public Cat(){
        super("Kot");
    }
    public Cat(String name){
        super("Кот");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "name='" + name + '\'' +
                '}';
    }
}
