public class Cheetah extends Cat implements ISpeed{
    public Cheetah(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public void speed() {
        System.out.println("Я очень быстрый");
    }
}
