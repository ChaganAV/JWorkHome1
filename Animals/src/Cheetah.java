public class Cheetah extends Cat implements ISpeed{
    public Cheetah(int weight) {
        super("Гепард", weight);
    }

    @Override
    public void speed() {
        System.out.println("Я очень быстрый");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
