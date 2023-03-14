public class Elephant extends Animal implements IHorbivore{
    public Elephant(String genus, int weight) {
        super(genus, weight);
    }
    @Override
    public void horbivore() {
        System.out.println("Я очень большой, но вегетарианец");
    }
}
