package com.company;

import java.util.Stack;

/**
 * Created by khan on 3/9/17.
 */
public class LevelOrderSpiral {
    Node tree;

    public static void main(String arg[]) {
        LevelOrderSpiral levelOrderSpiral = new LevelOrderSpiral();
        levelOrderSpiral.tree = new Node(20);
        levelOrderSpiral.tree.left = new Node(2);
        levelOrderSpiral.tree.right = new Node(3);
        levelOrderSpiral.tree.left.left = new Node(4);
        levelOrderSpiral.tree.right.right = new Node(5);
        traverse_left_right(levelOrderSpiral.tree);
        traverse_right_lefght(levelOrderSpiral.tree);
    }

    private static void traverse_right_lefght(Node tree) {
        if (tree == null)
            return;
        System.out.println("\n");
        Stack<Node> nodeStack = new Stack<>();
        Stack<Node> nodeStack1 = new Stack<>();
        nodeStack.add(tree);
        while (!nodeStack.isEmpty() || !nodeStack1.isEmpty()) {
            while (!nodeStack.isEmpty()) {
                Node tempNode = nodeStack.pop();
                System.out.print("\t" + tempNode.key);
                if (tempNode.right != null) {
                    nodeStack1.add(tempNode.right);
                }
                if (tempNode.left != null) {
                    nodeStack1.add(tempNode.left);
                }
            }
            while (!nodeStack1.isEmpty()) {
                Node tempNode = nodeStack1.pop();
                System.out.print("\t" + tempNode.key);
                if (tempNode.left != null) {
                    nodeStack.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    nodeStack.add(tempNode.right);
                }
            }
        }

    }

    private static void traverse_left_right(Node tree) {
        if (tree == null)
            return;
        Stack<Node> nodeStack = new Stack<>();
        Stack<Node> nodeStack1 = new Stack<>();
        nodeStack.add(tree);
        while (!nodeStack.isEmpty() || !nodeStack1.isEmpty()) {
            while (!nodeStack.isEmpty()) {
                Node temmpNode = nodeStack.pop();
                System.out.print("\t" + temmpNode.key);
                if (temmpNode.left != null) {
                    nodeStack1.add(temmpNode.left);
                }
                if (temmpNode.right != null) {
                    nodeStack1.add(temmpNode.right);
                }
            }
            while (!nodeStack1.isEmpty()) {
                Node tempNode = nodeStack1.pop();
                System.out.print("\t" + tempNode.key);
                if (tempNode.right != null) {
                    nodeStack.add(tempNode.right);
                }
                if (tempNode.left != null) {
                    nodeStack.add(tempNode.left);
                }
            }
        }
    }
}
