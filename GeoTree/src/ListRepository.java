import java.util.List;

public class ListRepository implements IRepository{
    private List<Node> repo;

    public ListRepository(List<Node> repo) {
        this.repo = repo;
    }

    @Override
    public void listRepository(List<Node> nodes) {
        this.repo = nodes;
    }
}
