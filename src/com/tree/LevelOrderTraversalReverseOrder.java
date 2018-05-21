package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author waseem.khan since 5/21/18.
 * Start adding node in queue(Q) as if it has right reference or left reference.
 * and poll the queue node and put is stack by one by one.
 * finally print all the available node in stask(S)
 */
public class LevelOrderTraversalReverseOrder {
  private Node root;
  private Queue<Node> nodeQueue;
  private Stack<Node> nodeStack;

  private void reverseOrderTraversal(Node node) {
    if(!Node.isNodeExist(node)) {
      return;
    }
    nodeQueue = new LinkedList<>();
    nodeStack = new Stack<>();
    nodeQueue.add(node);
    while (!nodeQueue.isEmpty()) {
      Node tempNode = nodeQueue.poll();
      nodeStack.push(tempNode);
      if(Node.isNodeExist(tempNode.right))
        nodeQueue.add(tempNode.right);
      if(Node.isNodeExist(tempNode.left))
        nodeQueue.add(tempNode.left);
    }

    while (!nodeStack.empty()) {
      System.out.print(nodeStack.pop().data + " ");
    }
  }

  public static void main(String[] args) {
    LevelOrderTraversalReverseOrder traversalReverseOrder = new LevelOrderTraversalReverseOrder();

    traversalReverseOrder.root = Node.insertNode(1);
    traversalReverseOrder.root.left = Node.insertNode(2);
    traversalReverseOrder.root.left.left = Node.insertNode(4);
    traversalReverseOrder.root.left.right = Node.insertNode(5);
    traversalReverseOrder.root.right = Node.insertNode(3);

    System.out.println("Inorder traversal ... ");
    Node.traverse(traversalReverseOrder.root);
    System.out.println();
    traversalReverseOrder.reverseOrderTraversal(traversalReverseOrder.root);
    System.out.println();
  }
}
