package org.models.person;

import org.data.*;
import org.models.animal.*;
import org.models.house.*;

public class Main {
    public static void main(String[] args) {
        try {
            Person mary = new Person("Mary", 31,"w");
            Person jon = new Person("Jon", 33, "m");
            Person baby = new Person("Larry", 5, "m");
            Person tovald = new Person("Tovald", 65, "m");
            Person lisa = new Person("Lisa", 64, "w");
            ListPersons persons = new ListPersons();
            persons.add(mary);
            persons.add(jon);
            persons.add(baby);
            persons.add(tovald);
            persons.add(lisa);
            for(Person p: persons.getPersons()) {
                System.out.println(p.toString());
            }
            ListNodes nodes = new ListNodes();
            nodes.add(new Node(mary, Relation.mather, baby));
            nodes.add(new Node(mary, Relation.wife, jon));
            nodes.add(new Node(jon, Relation.father, baby));
            nodes.add(new Node(tovald, Relation.father, jon));

            for(Node n: nodes.getNodes()){
                    System.out.println(n);
            }
            System.out.println("-".repeat(15));

            Cat murka = new Cat("мурка");
            System.out.println(jon + " ищет кошку");
            Wardrobe shkaf = new Wardrobe();
            shkaf.openDoor(new Door("левая дверка шкафа"));
            jon.call(murka);
            murka.speak();
            System.out.println(murka);

            Dog reks = new Dog("рекс");

            jon.call(reks);
            reks.speak();
            System.out.println(reks);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //System.out.println("p");
    }
}