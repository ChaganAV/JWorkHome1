public class Ostrich extends Bird implements ISpeed{
    public Ostrich(int weight) {
        super("Страус", weight);
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
