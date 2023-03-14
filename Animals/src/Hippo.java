public class Hippo extends Animal implements IHorbivore, IRaptor{
    public Hippo(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void horbivore() {
        System.out.println("Как правило я ем траву");
    }

    @Override
    public void raptor() {
        System.out.println("Но я могу быть агрессивным");
    }
}
