public class Dog extends Animal{
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
    public void say() {
        System.out.println("гав-гав");
    }

    @Override
    public String toString() {
        return String.format("I am %s, my name is %s",super.toString(),name);
    }
}
