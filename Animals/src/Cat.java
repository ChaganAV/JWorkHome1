public class Cat extends Animal implements Speaking {
    public Cat(){
        super("Кошка");
    }

    public Cat(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public void speak() {
        System.out.println("mau-mau-mau");
    }

    @Override
    public String toString() {
        return String.format("Мур-р %s, я мур-мур %s", super.toString());
    }
}
