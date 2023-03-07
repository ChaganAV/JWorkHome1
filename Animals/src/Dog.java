public class Dog extends Animal implements Speaking, Swimmable{
    private String name;
    public Dog(){
        super("Собака");
        this.name = "Дворняжка";
    }
    public Dog(String name){
        this();
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("гав-гав");
    }

    @Override
    public void swim() {
        System.out.println("Я плыву-плыву...буль-буль");
    }

    @Override
    public String toString() {
        return String.format("I am %s, my name is %s",super.toString(),name);
    }
}
