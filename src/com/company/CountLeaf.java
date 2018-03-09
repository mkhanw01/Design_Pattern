package com.company;

/**
 * Created by khan on 3/7/17.
 */
public class CountLeaf {
    int x =5;
    Double aDouble = Double.valueOf(x);
    Node tree;
    int countLeaf(Node node){
        if(node==null)
            return 0;
        else if(node.left==null && node.right==null)
            return 1;
        else
        return countLeaf(node.left)+countLeaf(node.right);
    }
    public static void main(String arg[]){
        CountLeaf  countLeaf= new CountLeaf();
        countLeaf.tree=new Node(20);
        countLeaf.tree.left=new Node(10);
        countLeaf.tree.right=new Node(100);
        countLeaf.tree.left.left=new Node(-10);
        countLeaf.tree.left.right=new Node(-5);
        countLeaf.tree.left.left.left=new Node(-100);
        countLeaf.tree.left.left.left.right=new Node(-20);
        System.out.print("Number of Leaf node in Tree : = "+countLeaf.countLeaf(countLeaf.tree));
    }
}
