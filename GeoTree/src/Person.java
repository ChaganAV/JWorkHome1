import java.util.ArrayList;
import java.util.List;
public class Person extends Human{
    private int age;
    private Gender gender;
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

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String gend = "мужчина";
        if(this.gender == Gender.woman) gend = "женщина";
        return String.format("%s %s возраст %d",super.getName(),gend,age);
    }
}
