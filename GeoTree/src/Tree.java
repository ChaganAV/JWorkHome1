import java.util.List;

public abstract class Tree{
    private List<Node> nodes;
    public abstract void add(Node node);
    public abstract void delete(int item);
}
