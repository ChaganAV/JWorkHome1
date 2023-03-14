public class Person {
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
        this.name = "";
        this.age = 0;
    }
    public void speak(String message){
        System.out.println(message);
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
    public void closeDoor(Ark ark){
        ark.setLocked(false);
    }
    @Override
    public String toString() {
        return String.format("Я %s, меня зовут %s",super.toString(),name);
    }
}
