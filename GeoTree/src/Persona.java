public class Persona extends Person{
    private int birthday;

    public Persona(String name, int age, Gender gender, int year) {
        super(name, age, gender);
        this.birthday = year;
    }

    @Override
    public String toString() {
        return super.toString()+String.format(", год рождения "+this.birthday);
    }
}
