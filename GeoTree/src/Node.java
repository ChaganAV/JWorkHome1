public class Node extends NodeParent{
    private Person child;

    @Override
    public String toString() {
        String rel = "родитель";
        if (getRelation() == Relation.child) rel="ребенок";
        return String.format("%s (%s) -> %s",getParent(),rel,child);
    }

    public Node(Person parent, Relation relation, Person child) {
        super(parent, relation);
        this.child = child;
    }
}
