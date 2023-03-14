import java.util.ArrayList;
import java.util.List;

public class ListRepository {
    List<Animal> repository = new ArrayList<>();

    public ListRepository() {
        Dog dog = new Dog(5);
        Cat cat = new Cat("Кошка",3);
        Cheetah cheetah = new Cheetah(50);
        Elephant elephant = new Elephant(5000);
        Hippo hippo = new Hippo(1500);
        Lion lion = new Lion(200);
        Orel orel = new Orel(5);
        Ostrich ostrich = new Ostrich(100);
        Porcupine porc = new Porcupine(10);
        Caban caban = new Caban(100);
        Skunk skuns = new Skunk(3);
        Suslic suslic = new Suslic(1);
        Turtle turtle = new Turtle(2);
        Wolf wolf = new Wolf(15);
        repository.add(dog);
        repository.add(cat);
        repository.add(cheetah);
        repository.add(elephant);
        repository.add(hippo);
        repository.add(lion);
        repository.add(ostrich);
        repository.add(porc);
        repository.add(caban);
        repository.add(skuns);
        repository.add(suslic);
        repository.add(turtle);
        repository.add(wolf);
    }

    public List<Animal> getRepository() {
        return repository;
    }
}
