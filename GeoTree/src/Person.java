import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private int age;
    private String gender;
//    List<Person> persons = new ArrayList<>();
    public Person(){
        name = "Неизвестный";
        age = 0;
        gender = "m";
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
    public Person(String name, int age,String gender){
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("%s %d %s",name,age,gender);
    }
}
