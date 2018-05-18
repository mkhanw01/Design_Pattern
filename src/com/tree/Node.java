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

  protected static void preOrder(Node node) {
    if(isNodeExist(node)) {
      System.out.print(node.data + " ");
      preOrder(node.left);
      preOrder(node.right);
    }
  }

  protected static int getHieght(Node node) {
    if (!isNodeExist(node)) {
      return 0;
    } else {
      int leftHieght = getHieght(node.left);
      int rightHieght = getHieght(node.right);
      if (leftHieght > rightHieght)
        return leftHieght + 1;
      else
        return rightHieght + 1;
    }
  }
  protected static Node insertNode(Integer data) {
    return new Node(data);
  }
}
