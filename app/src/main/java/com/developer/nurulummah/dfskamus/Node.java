package com.developer.nurulummah.dfskamus;

import java.util.ArrayList;

/**
 * Created by nurulummah on 30/07/2018.
 */

public class Node {
    //    A Unique Identifier for our node
    public String stationName;
    //    An arraylist containing a list of Nodes that
    //    This node is directly connected to - It's child nodes.
    Node leftChild;
    Node right4Child;
    Node right3Children;
    Node right2Child;
    Node right1Child;

    public Node(String stationName){
        this.stationName = stationName;
        this.leftChild = null;
        this.right4Child = null;
        this.right3Children = null;
        this.right2Child = null;
        this.right1Child = null;
    }

    public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.right4Child != null)
        {
            childNodes.add(right4Child);
        }
        if(this.right3Children != null) {
            childNodes.add(right3Children);
        }
        if(this.right2Child != null) {
            childNodes.add(right2Child);
        }
        if(this.right1Child != null) {
            childNodes.add(right1Child);
        }
        return childNodes;
    }

    //    An auxiliary function which allows
    //    us to remove any child nodes from
    //    our list of child nodes.
    public boolean removeChild(Node n){
        return false;
    }
}
