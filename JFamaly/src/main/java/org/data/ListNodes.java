package org.data;

import org.models.person.Node;
import org.models.person.Relation;

import java.util.ArrayList;
import java.util.List;

public class ListNodes {
    private List<Node> nodes = new ArrayList<>();
    public void add(Node node){
        nodes.add(node);
    }
//    public List<Node> getNodes(Relation rel){
//        List<Node> nodesFilter = getNodes();
//        nodesFilter.stream().filter(node -> (node.getRelation().equals(rel.toString())));
//        return nodesFilter;
//    }
    public List<Node> getNodes(){return nodes;}
}
