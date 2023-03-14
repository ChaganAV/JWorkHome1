public class Suslic extends Animal{
    public Suslic(int weight) {
        super("Суслик", weight);
    }

    @Override
    public String toString() {
        return String.format("Я %s... просто %s",super.toString(),super.toString().toLowerCase());
    }
}
