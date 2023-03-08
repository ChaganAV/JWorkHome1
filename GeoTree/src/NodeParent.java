public abstract class NodeParent {
    Person p1;
    Relation relation;

    public NodeParent(Person p1, Relation relation) {
        this.p1 = p1;
        this.relation = relation;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }
}
