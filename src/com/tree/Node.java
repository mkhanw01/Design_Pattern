package com.tree;

/**
 * @author waseem.khan since 5/11/18.
 */


public class Node {
  Node left, right;
  Integer data;

  public Node(Integer data) {
    this.data = data;
    left = right = null;
  }

  protected static boolean isNodeExist(Node node) {
    return node != null;
  }

  protected static void traverse(Node node) {
    if (isNodeExist(node)) {
      traverse(node.left);
      System.out.print(node.data + " ");
      traverse(node.right);
    }
  }

  protected static void postOrder(Node node) {
    if(isNodeExist(node)) {
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.data +" ");
    }
  }

  protected static Node insertNode(Integer data) {
    return new Node(data);
  }
}
