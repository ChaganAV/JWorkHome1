public class Main {
    public static void main(String[] args) {
        Ark kovcheg = new Ark(true,"Коричневый");
        if (kovcheg.getState())
            System.out.println(kovcheg.toString()+" открыт");
        Person God = new Person();

        System.out.println(kovcheg.toString());
    }
}