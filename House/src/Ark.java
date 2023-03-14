public class Ark extends Wardrobe{
    public Ark(Boolean lock, String color) {
        super(lock, color);
    }

    @Override
    public String toString() {
        return String.format("Ковчег");
    }
}
