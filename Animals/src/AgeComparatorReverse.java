import java.util.Comparator;

public class AgeComparatorReverse implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getWeight()-o1.getWeight();
    }
}
