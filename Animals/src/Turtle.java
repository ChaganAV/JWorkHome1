public class Turtle extends Animal implements ISpeed, IThink{

    public Turtle(int weight) {
        super("Черепаха", weight);
    }

    @Override
    public void speed() {
        System.out.println("Я очень медленная");
    }

    @Override
    public void think() {
        System.out.println("Я медленная, потому что много думаю");
    }
}
