package com.company;

import java.util.LinkedList;

/**
 * Created by khan on 8/13/17.
 */
public class CheckPathSum {
  private Node tree;
  CheckPathSum(){
    tree=null;
  }

  public boolean isPathSum(final Node root, final int sum) {
    if (root == null)
      return false;

    LinkedList<Node> nodes = new LinkedList<Node>();
    LinkedList<Integer> values = new LinkedList<Integer>();

    nodes.add(root);
    values.add(root.key);

    while (!nodes.isEmpty()) {
      Node curr = nodes.poll();
      int sumValue = values.poll();

      if (curr.left == null && curr.right == null && sumValue == sum) {
        return true;
      }

      if (curr.left != null) {
        nodes.add(curr.left);
        values.add(sumValue + curr.left.key);
      }

      if (curr.right != null) {
        nodes.add(curr.right);
        values.add(sumValue + curr.right.key);
      }
    }

    return false;
  }

  public static void main(String[] args) {
    CheckPathSum checkPathSum = new CheckPathSum();
    checkPathSum.tree = new Node(5);
    /**
     * constructing tree node at right side
     */
    checkPathSum.tree.right = new Node(8);
    checkPathSum.tree.right.left = new Node(13);
    checkPathSum.tree.right.right = new Node(4);
    checkPathSum.tree.right.right.right = new Node(1);
    /**
     *  constructing tree node at left side side
     */
    checkPathSum.tree.left = new Node(4);
    checkPathSum.tree.left.left = new Node(11);
    checkPathSum.tree.left.left.right = new Node(2);
    checkPathSum.tree.left.left.left = new Node(7);
    if(checkPathSum.isPathSum(checkPathSum.tree, 22)){
      System.out.println("Tree is  following children sum property ");
    }else {
      System.out.println("Tree is  not following children sum property");
    }
  }
}
