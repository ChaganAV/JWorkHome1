public class Ostrich extends Bird implements IFly,ISpeed{
    public Ostrich(String genus, int weight) {
        super(genus, weight);
    }

    @Override
    public void fly() {
        System.out.println("Крылья есть, но не умею летать, сам расстроен");;
    }

    @Override
    public void speed() {
        System.out.println("Но зато я круто бегаю");
    }

}
