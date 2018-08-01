package com.developer.nurulummah.dfskamus;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by nurulummah on 30/07/2018.
 */

public class DepthFirstSearch extends AbstractSearch {
    com.developer.nurulummah.dfskamus.Node startNode;
    com.developer.nurulummah.dfskamus.Node goalNode;

    public DepthFirstSearch(com.developer.nurulummah.dfskamus.Node start, com.developer.nurulummah.dfskamus.Node goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean execute(){
        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found at 0 depth");
            System.out.println(startNode);
        }
        Stack<com.developer.nurulummah.dfskamus.Node> nodeStack = new Stack<>();
        ArrayList<com.developer.nurulummah.dfskamus.Node> visitedNodes = new ArrayList<>();

        nodeStack.add((com.developer.nurulummah.dfskamus.Node) startNode);

        while(!nodeStack.isEmpty()){
            com.developer.nurulummah.dfskamus.Node current = nodeStack.pop();
            if(current.equals(goalNode)){
                System.out.print(visitedNodes);
                System.out.println("Goal node found");
                return true;
            }
            else {
                visitedNodes.add(current);
                nodeStack.addAll(current.getChildren());
            }
        }
        return false;
    }
}
