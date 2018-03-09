package com.company;

/**
 * Created by khan on 3/14/17.
 */
public class CheckSumChilderProperty {
  Node tree;

  public static void main(String[] args) {
    CheckSumChilderProperty checkSumChilderProperty = new CheckSumChilderProperty();
    checkSumChilderProperty.tree = new Node(10);
    checkSumChilderProperty.tree.right = new Node(2);
    checkSumChilderProperty.tree.right.left = new Node(2);
    checkSumChilderProperty.tree.left = new Node(8);
    checkSumChilderProperty.tree.left.left = new Node(-5);
    checkSumChilderProperty.tree.left.right = new Node(13);
    if (checkSumChilderProperty.isSumProperty(checkSumChilderProperty.tree) != 0) {
      System.out.println("Folloing sum property ");
    }
   else System.out.println("Not following property ");
  }

  private int isSumProperty(Node node) {
    int leftData = 0;
    int rightData = 0;
    if (node == null || node.left == null && node.right == null)
      return 1;
    if (node.left != null)
      leftData = node.left.key;
    if (node.right != null)
      rightData = node.right.key;
    if ((node.key == leftData + rightData) && isSumProperty(node.left)!=0 && isSumProperty(node
        .right)!=0)
       return 1;
    else return 0;
  }
}
