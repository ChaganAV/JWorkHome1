public class Dog extends Animal implements ISpeaking, ISwimmable{
    public Dog(){
        super("Собака");
    }

    public Dog(int weight) {
        super("Собака",weight);
    }

    @Override
    public void speak() {
        System.out.println("гав-гав");
    }

    @Override
    public void swim() {
        System.out.println("Я плыву-плыву...буль-буль");
    }

    @Override
    public String toString() {
        return String.format("Я %s, друг человека",super.toString());
    }

    @Override
    public void speak(String text) {
        System.out.println(text);
    }
}
