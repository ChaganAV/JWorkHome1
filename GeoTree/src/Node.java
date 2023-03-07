import java.util.ArrayList;
import java.util.List;

public class Node {
    Person p1;
    Relation relation;
    Person p2;

    public Node(Person p1, Relation rel, Person p2){
        this.p1 = p1;
        this.relation = rel;
        this.p2 = p2;
    }
    public String getRelation(){
        return this.relation.toString();
    }
    @Override
    public String toString() {
        return String.format("%s: %s %s",p1,relation,p2);
    }
}
