package com.developer.nurulummah.dfskamus;

import org.w3c.dom.Node;

/**
 * Created by nurulummah on 30/07/2018.
 */

public abstract class AbstractSearch {
    com.developer.nurulummah.dfskamus.Node startNode;
    com.developer.nurulummah.dfskamus.Node goalNode;

    public AbstractSearch(com.developer.nurulummah.dfskamus.Node startNode, com.developer.nurulummah.dfskamus.Node goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
    }


    public abstract boolean execute();
}
