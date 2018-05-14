package com.tree;

import java.util.Stack;

/**
 * @author waseem.khan since 5/14/18.
 * 1) Check tree is empty or not.
 * 2) Create a Stack tree type, and give the current node reference as root.
 * 3) while current node's left reference is not null push node in stack.
 * 4) While stack is not empty pop node and print , and if node.right is not null then make
 * current node as node.right
 * 5) go to step 3.
 */
public class TraverseInorderWR {

  private final ThreadLocal<Stack<Node>> stack = ThreadLocal.withInitial(() -> new Stack<>());
  private Node root;

  /**
   * this method will traverse node in in_order without recursion
   *
   * @param node Node object reference.
   */
  private void inorderTraversalWithoutRecursion(Node node) {
    if (!Node.isNodeExist(node)) {
      return;
    }
    while (Node.isNodeExist(node)) {
      stack.get().push(node);
      node = node.left;
    }

    while (!stack.get().empty()) {
      node = stack.get().pop();
      System.out.print(node.data + " ");
      if (Node.isNodeExist(node.right)) {
        node = node.right;
        while (Node.isNodeExist(node)) {
          stack.get().push(node);
          node = node.left;
        }
      }
    }
  }

  public static void main(String[] args) {
    TraverseInorderWR inorderWR = new TraverseInorderWR();
    inorderWR.root = Node.insertNode(20);
    inorderWR.root.left = Node.insertNode(30);
    inorderWR.root.left.left = Node.insertNode(40);
    inorderWR.root.left.left.left = Node.insertNode(50);
    inorderWR.root.left.right = Node.insertNode(25);
    inorderWR.root.left.right.right = Node.insertNode(28);
    inorderWR.root.left.right.right.right = Node.insertNode(29);

    inorderWR.root.right = Node.insertNode(100);
    inorderWR.root.right.left = Node.insertNode(70);
    inorderWR.root.right.left.right = Node.insertNode(80);
    inorderWR.root.right.left.right.right = Node.insertNode(90);

    System.out.println("traverse with recursion...");
    Node.traverse(inorderWR.root);
    System.out.println();
    System.out.println("traverse without recursion..");
    inorderWR.inorderTraversalWithoutRecursion(inorderWR.root);
  }
}
