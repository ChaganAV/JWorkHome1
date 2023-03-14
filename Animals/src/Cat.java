public class Cat extends Animal implements ISpeaking {
    public Cat(String genus,int weight) {
        super(genus, weight);
    }

    @Override
    public void speak() {
        System.out.println("mau-mau-mau");
    }

    @Override
    public String toString() {
        return String.format("Мур-р, я мур-мур %s", super.toString());
    }

    @Override
    public void speak(String text) {
        System.out.println(text);
    }
}
