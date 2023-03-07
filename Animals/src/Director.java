public class Director extends Person implements Publish{
    private Gender gender;
    public Director(String name, int age, Gender gen) {
        super(name, age);
        this.gender = gen;
    }

    @Override
    public void post() {
        System.out.println("Я директор этого зоопарка");
    }

    @Override
    public void speak() {
        System.out.println("Я говорю как начальник!");
    }

}
