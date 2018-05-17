package com.tree;

/**
 * @author waseem.khan since 5/15/18.
 */
public class ClockWiseLevelOrderTraversal {
  private Node root;


  private void levelOrder(Node node) {
    if(Node.isNodeExist(node)) {
      System.out.print(node.data + " ");
      if(node.left != null) {
        levelOrder(node.left);
      }
      if(node.right != null) {
        levelOrder(node.right);
      }
    }
  }



  public static void main(String[] args) {
    ClockWiseLevelOrderTraversal levelOrderTraversal = new ClockWiseLevelOrderTraversal();
    levelOrderTraversal.root = Node.insertNode(1);

    levelOrderTraversal.root.left = Node.insertNode(2);
    levelOrderTraversal.root.left.left = Node.insertNode(4);
    levelOrderTraversal.root.left.right = Node.insertNode(5);

    levelOrderTraversal.root.right = Node.insertNode(3);

    System.out.println("Inorder traversal ... ");
    Node.traverse(levelOrderTraversal.root);
    System.out.println();
    System.out.println("level order traversal ... ");
    levelOrderTraversal.levelOrder(levelOrderTraversal.root);
  }
}
