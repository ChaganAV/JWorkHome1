package org.person;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Person p1;
    Relation relation;
    Person p2;
    List<Node> nodes = new ArrayList<>();
    public Node(Person p1, Relation rel, Person p2){
        this.p1 = p1;
        this.relation = rel;
        this.p2 = p2;
    }
    public void addNode(Node node){
        nodes.add(node);
    }
    public List<Node> getNodes(Relation rel){
        return nodes;
    }
}
