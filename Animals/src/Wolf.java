public class Wolf extends Animal implements IRaptor{
    public Wolf(int weight) {
        super("Волк",weight);
    }

    @Override
    public void raptor() {
        System.out.println("я похож на собаку, но характер у меня строгий");
    }
}
