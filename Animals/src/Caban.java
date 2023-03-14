public class Caban extends Animal implements ISpeaking{
    public Caban(int weight) {
        super("Кабан",weight);
    }
    @Override
    public void speak() {
        System.out.println("Хрю-хрю");
    }

    @Override
    public void speak(String text) {
        System.out.println(text);
    }
}
