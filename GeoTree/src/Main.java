import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileRepository repo = new FileRepository("Adams.txt");
            repo.fillRepository();
            List<Persona> personas = repo.getPersonas();
            GeoAdams adams = new GeoAdams();
            Persona temp = null;
            for(Persona p: personas){
                if(temp == null)
                    temp = p;
                else {
                    Node node = new Node(temp,Relation.parent,p);
                    temp = p;
                    adams.add(node);
                }
            }
            for(Node n: adams.getNodes()){
                System.out.println(n);
            }
            System.out.println("--- С учетом возраста ---");
            int ageFilter = 900;
            for(Node n: adams.getNodes(Relation.parent).stream().filter(n->n.p1.getAge()>ageFilter).toList()){
                System.out.println(n);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}