import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileRepository repo = new FileRepository("Adams.txt");
            repo.fillRepository();
            List<Person> persons = repo.getPersons();
            GeoAdams adams = new GeoAdams();
            Person parent = null;
            List<Person> children = new ArrayList<>();
            for(Person p: persons){
                if(parent == null)
                    parent = p;
                else {
                    Node node = new Node(parent, Relation.parent, p);
                    parent = p;
                    adams.add(node);
                }
            }
            for(Node n: adams.getNodes()){
                System.out.println(n);
            }
            System.out.println("--- С учетом возраста ---");
            int ageFilter = 500;
            for(Node n: adams.getNodes(Relation.parent).stream().filter(n->n.getParent().getAge()>ageFilter).toList()){
                System.out.println(n);
            }
            System.out.println("--- Отсортируем по возрасту ---");
            for(Person p: persons.stream().sorted((p1,p2)->Integer.compare(p1.getAge(),p2.getAge())).toList()){
                System.out.println(p);
            }

            System.out.println("--- Самый долгожитель ---");
            Person maxAge = new Person();
            for(Person p: persons){
                if(p.getAge()>maxAge.getAge()){
                    maxAge = p;
                }
            }
            System.out.println(maxAge);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}