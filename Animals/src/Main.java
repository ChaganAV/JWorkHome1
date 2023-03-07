import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        Dog barsik = new Dog("Барсик");
        Dog rekc = new Dog("рekc");
        Cat murka = new Cat("Мурка");
        zoo.add(barsik);
        zoo.add(rekc);
        zoo.add(murka);
        for(var z: zoo) {
            System.out.println(z);
        }
    }
}