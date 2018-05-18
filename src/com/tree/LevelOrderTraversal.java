package com.tree;

/**
 * @author waseem.khan since 5/18/18.
 */
public class LevelOrderTraversal {
  private Node root;

  private void levelOrderTraversal(Node node, int level) {
    if (!Node.isNodeExist(node)) {
      return;
    }
    if (level == 1) {
      System.out.print(node.data + " ");
    } else if (level > 1) {
      levelOrderTraversal(node.left, level - 1);
      levelOrderTraversal(node.right, level - 1);
    }
  }
  private void printLevel(Node node) {
    int height = Node.getHieght(node);
    for(int i=1; i<=height;i++) {
      levelOrderTraversal(node, i);
    }
  }

  public static void main(String[] args) {
    LevelOrderTraversal traversal = new LevelOrderTraversal();
    traversal.root = Node.insertNode(1);
    traversal.root.left = Node.insertNode(2);
    traversal.root.left.left = Node.insertNode(4);
    traversal.root.left.right = Node.insertNode(5);
    traversal.root.right = Node.insertNode(3);
    System.out.println("inOrder treaversal of tree");
    Node.traverse(traversal.root);
    System.out.println();
    traversal.printLevel(traversal.root);
  }
}
