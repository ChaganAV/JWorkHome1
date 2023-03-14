public class Bird extends Animal implements IFly{
    public Bird() {
    }
    public Bird(String genus, int weight) {
        super(genus, weight);
    }

    public Bird(int weight) {
        super(weight);
    }

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }
}
