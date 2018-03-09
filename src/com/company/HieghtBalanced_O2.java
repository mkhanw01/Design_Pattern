package com.company;

/**
 * Created by khan on 3/29/17.
 */
public class HieghtBalanced_O2 {
  Node root ;

  public static void main(String[] args) {
    HieghtBalanced_O2 hieghtBalanced_o2 = new HieghtBalanced_O2();
    hieghtBalanced_o2.root = new Node(120);
    hieghtBalanced_o2.root.left = new Node(80);
    hieghtBalanced_o2.root.left.left = new Node(40);
    hieghtBalanced_o2.root.left.right = new Node(60);
    hieghtBalanced_o2.root.right = new Node(150);
    hieghtBalanced_o2.root.right.right = new Node(180);
    hieghtBalanced_o2.root.right.left = new Node(160);
    if(checkBalanced(hieghtBalanced_o2.root)) {
      System.out.println("Balanced....");
    }
    else
      System.out.println("Not balanced ..");
  }

  private static boolean checkBalanced(Node root) {
    int lh ;
    int rh ;
    if(root == null){
      return true;
    }
    lh = Height(root.left);
    rh = Height(root.right);
    if(Math.abs(lh -rh)<=1 && checkBalanced(root.left) && checkBalanced(root.right))
    return true;
    else return false;
  }

  private static int Height(Node root) {
    if(root == null)
      return 0;
    return 1+ Math.max(Height(root.left),Height(root.right));
  }
}
