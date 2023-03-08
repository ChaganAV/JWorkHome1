import java.util.ArrayList;
import java.util.List;
public class Person extends Human{
    private int age;
    private Gender gender;
//    List<Person> persons = new ArrayList<>();
    public Person(){
        super();
        age = 0;
        gender = null;
    }
    public Person(String name){
        super(name);
    }
    public Person(String name, int age){
        super(name);
        this.age = age;
    }
    public Person(String name, int age,Gender gender){
        super(name);
        this.age = age;
        this.gender = gender;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("%s %s возраст %d",super.getName(),gender,age);
    }
}
