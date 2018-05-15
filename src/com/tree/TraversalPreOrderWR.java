package com.tree;

import java.util.Stack;

/**
 * @author waseem.khan since 5/15/18.
 */
public class TraversalPreOrderWR  {
  private Node root;
  private Stack<Node> stack = new Stack<>();


  private void preOrderTraversal(Node node) {

    if(!Node.isNodeExist(node)) {
      return;
    }
    stack.push(node);
    while (!stack.empty()) {
      node = stack.pop();
      System.out.print(node.data+ " ");
      if(Node.isNodeExist(node.right)){
        stack.push(node.right);
      }
      if(Node.isNodeExist(node.left)) {
        stack.push(node.left);
      }
    }
  }


  public static void main(String[] args) {
    TraversalPreOrderWR preOrderWR = new TraversalPreOrderWR();
    preOrderWR.root = Node.insertNode(1);
    preOrderWR.root.left = Node.insertNode(2);
    preOrderWR.root.left.right = Node.insertNode(5);
    preOrderWR.root.left.left = Node.insertNode(4);

    preOrderWR.root.right = Node.insertNode(3);
    preOrderWR.root.right.right = Node.insertNode(7);
    preOrderWR.root.right.left = Node.insertNode(6);

    System.out.println("preOrder Traversal with recursion ..");
    Node.preOrder(preOrderWR.root);
    System.out.println();
    System.out.println("preOrder Traversal without recursion ...");
    preOrderWR.preOrderTraversal(preOrderWR.root);
  }
}
