public class Node extends NodeParent{
//    PersonOld p1;
//    Relation relation;
    //List<PersonOld> children;
    Person child;

//    public Node(PersonOld p1, Relation rel, List<PersonOld> child){
//        this.p1 = p1;
//        this.relation = rel;
//        this.children = child;
//    }
    //public String getRelation(){
//        return this.relation.toString();
//    }
    @Override
    public String toString() {
        String rel = "родитель";
        if (relation == Relation.child) rel="ребенок";
        return String.format("%s (%s) -> %s",p1,rel,child);
    }

    public Node(Person parent, Relation relation, Person child) {
        super(parent, relation);
        this.child = child;
    }
}
