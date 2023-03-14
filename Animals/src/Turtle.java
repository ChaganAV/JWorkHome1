public class Turtle extends Animal implements ISpeed, IThink{

    public Turtle(String genus, int weight) {
        super(genus, weight);
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
