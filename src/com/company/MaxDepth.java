package com.company;

/**
 * Created by khan on 3/7/17.
 */
public class MaxDepth {
    Node tree;

    int maxDepth(Node node) {
        if (node == null) {
            return 0;
        } else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);
            if (lDepth > rDepth)
                return lDepth + 1;
            else
                return rDepth + 1;
        }
    }
    public static void main(String arg[]){
        MaxDepth maxDepth= new MaxDepth();
        maxDepth.tree=new Node(20);
        maxDepth.tree.left=new Node(10);
        maxDepth.tree.right=new Node(100);
        maxDepth.tree.left.left=new Node(-10);
        maxDepth.tree.left.right=new Node(-5);
        maxDepth.tree.left.left.left=new Node(-100);
        maxDepth.tree.left.left.left.right=new Node(-20);
        System.out.print(" maximum depth of tree"+maxDepth.maxDepth(maxDepth.tree));
    }
}
