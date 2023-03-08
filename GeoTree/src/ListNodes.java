import java.util.ArrayList;
import java.util.List;

public class ListNodes implements IListNodes{
    private List<Node> nodes = new ArrayList<>();
    public void add(Node node){
        nodes.add(node);
    }
    public List<Node> getNodes(){return nodes;}
    public List<Node> getNodes(Relation rel){
        List<Node> nodesFilter = getNodes().stream().filter(n -> n.relation.equals(rel)).toList();
        return nodesFilter;
    }
}
