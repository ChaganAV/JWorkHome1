import java.util.ArrayList;
import java.util.List;

public class GeoNodes extends Tree implements IListRepository{
    private List<Node> nodes = new ArrayList<>();

    @Override
    public List<Node> getRepository() {
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
