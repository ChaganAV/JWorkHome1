import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Director noy = new Director("Ной",600,Gender.man);
        System.out.println(noy);
        noy.speak();
        noy.speak("Как бы вас собрать, по порядку?");
        noy.speak("Отправляемся в годовое плавание!");
        noy.speak("А ну-ка зверушки, перекличка...");
        System.out.println("---");
        ListRepository repository = new ListRepository();
        List<Animal> zoo = repository.getRepository();
        for(var z: zoo) {
            System.out.println(z);
            if(z instanceof ISpeaking) ((ISpeaking) z).speak();
            if(z instanceof IPublish) ((IPublish) z).post();
            if(z instanceof IHorbivore) ((IHorbivore) z).horbivore();
            if(z instanceof IRaptor) ((IRaptor) z).raptor();
            if(z instanceof IFly) ((IFly) z).fly();
            if(z instanceof ISpeed) ((ISpeed) z).speed();
            if(z instanceof ISwimmable) ((ISwimmable) z).swim();
            if(z instanceof IThink) ((IThink) z).think();
        }
        noy.speak("Отлично, отсортируемся по размеру и заходим в Ковчег...");
        System.out.println("---");
        Collections.sort(zoo,new AgeComparator());
        Iterator<Animal> iterator = zoo.iterator();
        while (iterator.hasNext()){
            Animal next = iterator.next();
            if(next instanceof Hippo){
                noy.speak("СТОЙТЕ, СТОЙТЕ, бегемот сейчас всю мелочь раздавит!!!");
                noy.speak("Выходите, будем заходить в обратном порядке...");
                break;
            }
            System.out.println(next);
        }
        System.out.println("---");
        Collections.sort(zoo,new AgeComparatorReverse());
        Iterator<Animal> iteratorReverse = zoo.iterator();
        Skunk skunk = new Skunk(1);
        while (iteratorReverse.hasNext()){
            Animal next = iteratorReverse.next();
            if(next instanceof Skunk) {
                skunk = (Skunk) next;
                noy.speak("Скунс, ты иди на воздухе постой, последним пойдешь...");
                iteratorReverse.remove();
            }
            System.out.println(next);
        }
        noy.speak("А теперь Скунс... я сказал горбатый, тьфу ты, Скунс");
        System.out.println(skunk.toString());
    }
}