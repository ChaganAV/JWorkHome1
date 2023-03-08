import java.util.ArrayList;
import java.util.List;

public class GeoAdams extends Tree implements IListNodes{
    private List<Node> nodes = new ArrayList<>();

    @Override
    public List<Node> getNodes() {
        return this.nodes;
    }

    @Override
    public void add(Node node) {
        nodes.add(node);
    }

    @Override
    public void delete(int item) {
        nodes.remove(item);
    }
}
