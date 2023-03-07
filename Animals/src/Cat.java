public class Cat extends Animal implements Speaking {
    private String name;
    public Cat(){
        super("Кошка");
    }
    public Cat(String name){
        this();
        this.name = name;
    }
    @Override
    public void speak() {
        System.out.println("mau-mau-mau");
    }

    @Override
    public String toString() {
        return String.format("I am %s, my name is %s", super.toString(),name);
    }
}
