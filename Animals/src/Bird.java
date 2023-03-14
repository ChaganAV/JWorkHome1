public class Bird extends Animal implements IFly{
    public Bird(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }
}
