package com.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author waseem.khan since 5/18/18.
 * make one Queue of type Node.
 * put the head node in queue
 * while queue is not empty pull out peek data and check
 * take pool data and put in some temp node named here peek.
 * if peek node left is available then put left data
 * if peek node right is availabe then put right data
 */
public class LevelOrderTraversalByQueue {
  private Node root;
  private Queue<Node> queue;

  private void printLevelOrder(Node node) {
    queue = new LinkedList();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node tempData = queue.poll();
      System.out.print(tempData.data+ " ");
      if(Node.isNodeExist(tempData.left)) {
        queue.add(tempData.left);
      }
      if(Node.isNodeExist(tempData.right)){
        queue.add(tempData.right);
      }
    }
  }


  public static void main(String[] args) {
    LevelOrderTraversalByQueue levelOrderTraversal = new LevelOrderTraversalByQueue();

    levelOrderTraversal.root = Node.insertNode(1);
    levelOrderTraversal.root.left = Node.insertNode(2);
    levelOrderTraversal.root.left.left = Node.insertNode(4);
    levelOrderTraversal.root.left.right = Node.insertNode(5);
    levelOrderTraversal.root.right = Node.insertNode(3);

    System.out.println("traverse in inorder..");
    Node.traverse(levelOrderTraversal.root);

    System.out.println();
    levelOrderTraversal.printLevelOrder(levelOrderTraversal.root);

  }
}
