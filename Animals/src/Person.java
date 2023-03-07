public class Person extends Animal implements Swimmable, Speaking{
    private String name;
    private int age;
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(String name) {
        this();
        this.name = name;
    }
    public Person(){
        super("Человек");
    }
    @Override
    public void speak() {
        System.out.println("Hello my frend!");
    }

    @Override
    public void swim() {
        System.out.println("Я еще не умею плавать, но могу научится");
    }

    @Override
    public String toString() {
        return String.format("I am %s, my name is %s",super.toString(),name);
    }
}
