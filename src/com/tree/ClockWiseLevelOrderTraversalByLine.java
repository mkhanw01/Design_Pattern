package com.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author waseem.khan since 5/21/18.
 */
public class ClockWiseLevelOrderTraversalByLine {
  private Node root;
  private Queue<Node> nodeQueue;
  private Queue<Node> nodeQueueAntiClock;

  private void traverseLevelOrderSplitByLine(Node node) {
    nodeQueue = new LinkedList<>();
    int nodeCount;
    if (!Node.isNodeExist(node))
      return;
    nodeQueue.add(node);
    while (true) {
      nodeCount = nodeQueue.size();
      if (nodeCount == 0) {
        break;
      }
      while (nodeCount > 0) {
        Node tempData = nodeQueue.poll();
        System.out.print(tempData.data);
        if (Node.isNodeExist(tempData.left))
          nodeQueue.add(tempData.left);
        if (Node.isNodeExist(tempData.right))
          nodeQueue.add(tempData.right);
        nodeCount--;
      }
      System.out.println();
    }
  }


  private void traversalLevelOrderSplitByLineAntiClockWise(Node node) {
    if (!Node.isNodeExist(node))
      return;
    nodeQueueAntiClock = new LinkedList<>();
    int countNode;
    nodeQueueAntiClock.add(node);
    while (true) {
      countNode = nodeQueueAntiClock.size();
      if (countNode == 0)
        break;
      while (countNode > 0) {
        Node tempData = nodeQueueAntiClock.poll();
        System.out.print(tempData.data + " ");
        if (Node.isNodeExist(tempData.right))
          nodeQueueAntiClock.add(tempData.right);
        if (Node.isNodeExist(tempData.left))
          nodeQueueAntiClock.add(tempData.left);
        countNode--;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ClockWiseLevelOrderTraversalByLine levelOrderTraversalByLine =
        new ClockWiseLevelOrderTraversalByLine();

    levelOrderTraversalByLine.root = Node.insertNode(1);
    levelOrderTraversalByLine.root.left = Node.insertNode(2);
    levelOrderTraversalByLine.root.left.left = Node.insertNode(4);
    levelOrderTraversalByLine.root.left.right = Node.insertNode(5);
    levelOrderTraversalByLine.root.right = Node.insertNode(3);

    System.out.println("Inorder traversal ... ");
    Node.traverse(levelOrderTraversalByLine.root);
    System.out.println();
    levelOrderTraversalByLine.traverseLevelOrderSplitByLine(levelOrderTraversalByLine.root);
    System.out.println();
    System.out.println(" AnticlockWise traversal ....");
    levelOrderTraversalByLine
        .traversalLevelOrderSplitByLineAntiClockWise(levelOrderTraversalByLine.root);
  }
}
