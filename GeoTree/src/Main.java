import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Person marry = new Person("Marry", 31,"w");
            Person jon = new Person("Jon", 33, "m");
            Person larry = new Person("Larry", 5, "m");
            Person tovald = new Person("Tovald", 65, "m");
            Person lisa = new Person("Lisa", 64, "w");
            Person catty = new Person("Catty", 89, "w");
            Person mark = new Person("Mark", 74, "m");
            Person felix = new Person("Felix", 14, "m");
            List<Person> persons = new ArrayList<>();
            persons.add(marry);
            persons.add(jon);
            persons.add(larry);
            persons.add(tovald);
            persons.add(lisa);
            for(Person p: persons) {
                System.out.println(p.toString());
            }
            ListNodes nodes = new ListNodes();
            nodes.add(new Node(marry, Relation.parent, larry));
            nodes.add(new Node(larry,Relation.child,marry));
            nodes.add(new Node(tovald, Relation.parent, marry));
            nodes.add(new Node(marry,Relation.child,tovald));
            nodes.add(new Node(lisa, Relation.parent, jon));
            nodes.add(new Node(jon, Relation.child, lisa));
            nodes.add(new Node(lisa,Relation.parent,marry));
            nodes.add(new Node(marry, Relation.child, lisa));
            nodes.add(new Node(catty,Relation.parent, lisa));
            nodes.add(new Node(lisa,Relation.child,catty));
            nodes.add(new Node(jon,Relation.parent,felix));
            nodes.add(new Node(felix,Relation.child,jon));

            for(Node n: nodes.getNodes()){
                System.out.println(n);
            }

            System.out.println("--- Relation parent ---");
            for(Node n: nodes.getNodes()){
                if (n.relation == Relation.parent)
                    System.out.println(n);
            }

            System.out.println("--- Relation child ---");
            for(Node n: nodes.getNodes(Relation.child)){
                System.out.println(n);
            }

            System.out.println("--- Отберем по возрасту ---");
            int age = 60;
            for(Node n: nodes.getNodes(Relation.parent).stream().filter(n -> n.p1.getAge()>age).toList()){
                System.out.println(n);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //System.out.println("p");
    }
}