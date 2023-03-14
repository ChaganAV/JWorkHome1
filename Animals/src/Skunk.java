public class Skunk extends Animal{
    public Skunk(int weight) {
        super("Скунс", weight);
    }

    @Override
    public String toString() {
        return String.format("Я %s, ой, простите, я пукнул, не удержался",super.toString());
    }
}
