public class Lion extends Cat implements IRaptor{
    public Lion(int weight) {
        super("Лев", weight);
    }

    @Override
    public void speak() {
        System.out.println("ррр-р-р-р");;
    }

    @Override
    public void raptor() {
        System.out.println("Ты это... без обид, я просто царь зверей, должность у меня такая");
    }
}
