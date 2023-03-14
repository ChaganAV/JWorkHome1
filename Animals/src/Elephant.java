public class Elephant extends Animal implements IHorbivore{
    public Elephant(int weight) {
        super("Слон", weight);
    }
    @Override
    public void horbivore() {
        System.out.println("Я очень большой, но вегетарианец");
    }
}
