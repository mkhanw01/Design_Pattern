package com.tree;

import java.util.Stack;

/**
 * @author waseem.khan since 5/14/18.
 * to crate two empty stack ... s1 and s2
 * push root node in stack s1 if tree is not empty
 * while s1 is not empty push in s2 and pop from s1
 * if poped node left is not null then push in s1
 * if poped node right is not null then pish in s2
 * while s2 is not empty poped node and print node.data
 */
public class TraversalPostOrderWR {
  private Stack<Node> leftStack = new Stack<>();
  private Stack<Node> rightStack = new Stack<>();
  private Node root;

  private void postOrderWithoutRecursion(Node node) {
    if (!Node.isNodeExist(node)) {
      return;
    }
    leftStack.push(node);

    while (!leftStack.empty()) {
      node = leftStack.pop();
      rightStack.push(node);
      if (Node.isNodeExist(node.left)) {
        leftStack.push(node.left);
      }
      if (Node.isNodeExist(node.right)) {
        leftStack.push(node.right);
      }
    }

    while (!rightStack.empty()) {
      System.out.print(rightStack.pop().data + " ");
    }
  }

  public static void main(String[] args) {
    TraversalPostOrderWR postOrderWR = new TraversalPostOrderWR();
    postOrderWR.root = Node.insertNode(1);
    postOrderWR.root.left = Node.insertNode(2);
    postOrderWR.root.left.right = Node.insertNode(5);
    postOrderWR.root.left.left = Node.insertNode(4);

    postOrderWR.root.right = Node.insertNode(3);
    postOrderWR.root.right.right = Node.insertNode(7);
    postOrderWR.root.right.left = Node.insertNode(6);

    System.out.println("postOrder Traversal with recursion ..");
    Node.postOrder(postOrderWR.root);
    System.out.println();
    System.out.println("postorder Traversal without recursion ...");
    postOrderWR.postOrderWithoutRecursion(postOrderWR.root);
  }
}
