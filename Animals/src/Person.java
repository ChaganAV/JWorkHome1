public abstract class Person extends Animal implements ISwimmable, Speaking{
    private String name;
    private int age;
    public Person(String name, int age){
        this(name);
        this.age = age;
    }
    public Person(String name) {
        this();
        this.name = name;
        this.age = 0;
    }
    public Person(){
        super("Человек");
        this.name = "Неизвестный";
        this.age = 0;
    }
    public abstract void speak();

    public void swim(){
        System.out.println("Я могу научится плавать");
    }

    @Override
    public String toString() {
        return String.format("Я %s, меня зовут %s",super.toString(),name);
    }
}
