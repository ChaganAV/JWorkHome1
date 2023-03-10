public class Watchman extends Person implements Publish{
    private Gender gender;
    public Watchman(String name, int age, Gender gen) {
        super(name, age);
        this.gender = gen;
    }

    @Override
    public void speak() {
        System.out.println("Стой, кто идет?");
    }

    @Override
    public void swim() {
        System.out.println("Я слишком стар, чтобы плавать (:");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void post() {
        System.out.println("Я сторож, охраняю местный зоопарк");
    }
}
