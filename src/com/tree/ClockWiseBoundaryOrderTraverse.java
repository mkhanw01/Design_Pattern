package com.tree;

/**
 * @author waseem.khan since 5/11/18.
 * Algorithm to traverse boundary order is devided in three part
 * this approch print clockwise
 * i) traverse root to left nodes top to bottom order except leave node.
 * ii) traverse leaves node in left to right order.
 * iii) traverse left to before root bottom to top order except leave node.
 * for anticlose wise just reverse the algorithm's calling order.
 */

public class ClockWiseBoundaryOrderTraverse {
  private Node root;

  /**
   * to get leaves node of tree
   *
   * @param node reference of Node .
   */
  private void printLeaves(Node node) {
    if (Node.isNodeExist(node)) {
      printLeaves(node.left);
      if (node.left == null && node.right == null ) {
        System.out.print(node.data + " ");
      }
      printLeaves(node.right);
    }
  }

  /**
   * to traverse left top to bottom order .
   *
   * @param node reference of Node.
   */
  private void printLeftTopBottomOrder(Node node) {
    if (Node.isNodeExist(node)) {
      if (Node.isNodeExist(node.left)) {
        System.out.print(node.data + " ");
        printLeftTopBottomOrder(node.left);
      } else if (Node.isNodeExist(node.right)) {
        System.out.print(node.data + " ");
        printLeftTopBottomOrder(node.right);
      }
    }
  }

  /**
   * to traverse right bottom to top order.
   *
   * @param node reference of Node.
   */
  private void printRightBottomTopOrder(Node node) {
    if (Node.isNodeExist(node)) {
      if (Node.isNodeExist(node.right)) {
        printRightBottomTopOrder(node.right);
        System.out.print(node.data + " ");
      } else if (Node.isNodeExist(node.left)) {
        printRightBottomTopOrder(node.left);
        System.out.print(node.data + " ");
      }
    }
  }

  /**
   * to execute all the traversal order.
   *
   * @param node reference of Node.
   */
  protected void printBoundaryOrder(Node node) {
    if (Node.isNodeExist(node)) {
      System.out.print(node.data+ " ");
      printLeftTopBottomOrder(node.left);
      printLeaves(node.left);
      printLeaves(node.right);
      printRightBottomTopOrder(node.right);
    }
  }

  public static void main(String[] args) {
    ClockWiseBoundaryOrderTraverse traverse = new ClockWiseBoundaryOrderTraverse();
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

    System.out.println("Recursive Inorder traversal or tree...");
    Node.traverse(traverse.root);
    System.out.println();
    System.out.println("Boundary Traversal of tree..");
    traverse.printBoundaryOrder(traverse.root);
  }

}
