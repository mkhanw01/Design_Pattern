package com.company;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by khan on 1/30/17.
 */
public class LevelOrder {
    Node root;
   void order(){
       Queue<Node> nodeQueue=new LinkedList<>();
       nodeQueue.add(root);
       while (!nodeQueue.isEmpty()){
           Node tempNode=nodeQueue.remove();
           System.out.print(" "+tempNode.key);
           if(tempNode.left!=null){
               nodeQueue.add(tempNode.left);
           }
           if(tempNode.right!=null){
               nodeQueue.add(tempNode.right);
           }
       }
   }
    public static void main(String[] arg){
        LevelOrder tree=new LevelOrder();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(5);
        tree.order();
    }
}
