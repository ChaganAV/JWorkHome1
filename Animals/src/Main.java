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
        zoo.add(new Director("Иван Петрович",56,Gender.man));
        zoo.add(new Watchman("дядя Ваня",68, Gender.man));
        for(var z: zoo) {
            System.out.println(z);
            if(z instanceof Speaking){
                ((Speaking) z).speak();
            }
            if(z instanceof Publish){
                ((Publish) z).post();
            }
        }
        List<Person> shtat = new ArrayList<>();
        Director director = new Director("Иван Петрович",56,Gender.man);
        Watchman watchman = new Watchman("дядя Ваня",68, Gender.man);
    }
}