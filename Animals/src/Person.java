public abstract class Person extends Animal implements ISwimmable, ISpeaking{
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

    public void swim(){
        System.out.println("Я могу научится плавать");
    }

    @Override
    public String toString() {
        return String.format("Я %s, меня зовут %s",super.toString(),name);
    }
}
