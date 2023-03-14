public class Director extends Person implements IPublish{
    private Gender gender;
    public Director(String name, int age, Gender gen) {
        super(name, age);
        this.gender = gen;
    }

    @Override
    public void post() {
        System.out.println("Я директор этого зоопарка, пора собрать зверушек в Ковчег");
    }

    @Override
    public void speak(String text) {

        System.out.println(text);
    }

    @Override
    public void speak() {
        System.out.println(String.format("Я дед Ной мне уже %d лет",this.getAge()));
    }
}
