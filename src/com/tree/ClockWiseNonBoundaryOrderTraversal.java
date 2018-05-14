package com.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author waseem.khan since 5/12/18.
 *
 * To traverse in  boundary ordertraversal fashion , and all boundary data
 * except non leaves store in list.
 * While traverse of leave node check that data is already stored in list if available then
 * ignore otherwise logged that data i.e our nonboundary traversal data .
 */
public class ClockWiseNonBoundaryOrderTraversal {
  private static ClockWiseBoundaryOrderTraverse orderTraverse = new ClockWiseBoundaryOrderTraverse();
  private static List<Integer> boundaryData = new ArrayList<>();
  private Node root;


  private void topToBottomTraverse(Node node) {
    if(Node.isNodeExist(node)) {
      if(Node.isNodeExist(node.left)) {
        boundaryData.add(node.data);
        topToBottomTraverse(node.left);
      } else if(Node.isNodeExist(node.right)) {
        boundaryData.add(node.data);
        topToBottomTraverse(node.right);
      }
    }
  }

  private void bottomToTopTraverse(Node node) {
    if(Node.isNodeExist(node)) {
      if(Node.isNodeExist(node.right)) {
        topToBottomTraverse(node.right);
        boundaryData.add(node.data);
      } else if(Node.isNodeExist(node.left)) {
        topToBottomTraverse(node.left);
        boundaryData.add(node.data);
      }
    }
  }

  private void traverseNonLeaves(Node node) {
    if(Node.isNodeExist(node)) {
      traverseNonLeaves(node.left);
      if((node.left != null || node.right != null) && isBoundaryNode(node.data)){
        System.out.print(node.data+ " ");
      }
      traverseNonLeaves(node.right);
    }
  }


  private boolean isBoundaryNode(Integer data) {
    return ! boundaryData.contains(data);
  }

  protected void traverseNonBoundaryOrder(Node node) {
    if(Node.isNodeExist(node)) {
      topToBottomTraverse(node.left);
      bottomToTopTraverse(node.right);
      traverseNonLeaves(node.left);
      traverseNonLeaves(node.right);
    }
  }

  private void logBoundaryData(List<Integer> integers) {
    for (Integer integer: boundaryData) {
      System.out.print(integer +" ");
    }
  }

  public static void main(String[] args) {
    ClockWiseNonBoundaryOrderTraversal traverse = new ClockWiseNonBoundaryOrderTraversal();
    traverse.root = Node.insertNode(20);
    traverse.root.left = Node.insertNode(8);
    traverse.root.left.left = Node.insertNode(4);
    traverse.root.left.right = Node.insertNode(12);
    traverse.root.left.right.left = Node.insertNode(10);
    traverse.root.left.right.right = Node.insertNode(14);

    traverse.root.right = Node.insertNode(22);
    traverse.root.right.left = Node.insertNode(50);
    traverse.root.right.left.right = Node.insertNode(28);
    traverse.root.right.right = Node.insertNode(25);

    //additional nodes
    traverse.root.left.right.left.right = Node.insertNode(15);
    traverse.root.right.left.right.left = Node.insertNode(19);
    traverse.root.right.right.left = Node.insertNode(24);
    System.out.println("Recursive Inorder traversal or tree...");
    Node.traverse(traverse.root);
    System.out.println();
    System.out.println("Traverse in boundary order");
    orderTraverse.printBoundaryOrder(traverse.root);
    System.out.println();

    System.out.println("Traverse in NonBoundary order..");
    traverse.traverseNonBoundaryOrder(traverse.root);
    System.out.println();

    System.out.println("boundary data values..");
    traverse.logBoundaryData(boundaryData);

  }
}
