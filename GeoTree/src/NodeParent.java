public abstract class NodeParent {
    private Person parent;
    private Relation relation;

    public NodeParent(Person p1, Relation relation) {
        this.parent = p1;
        this.relation = relation;
    }

    public Person getParent() {
        return parent;
    }

    public void setParent(Person parent) {
        this.parent = parent;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

}
