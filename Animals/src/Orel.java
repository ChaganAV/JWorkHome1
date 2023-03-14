public class Orel extends Bird{
    public Orel(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public void fly() {
        System.out.println("Я шикарно летаю");
    }
}
