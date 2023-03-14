public class Orel extends Bird implements IFly{
    public Orel(int weight) {
        super("Орел", weight);
    }

    @Override
    public void fly() {
        System.out.println("Я шикарно летаю");
    }
}
