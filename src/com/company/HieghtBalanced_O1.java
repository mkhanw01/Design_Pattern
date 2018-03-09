package com.company;

/**
 * Created by khan on 3/29/17.
 */
public class HieghtBalanced_O1 {
  Node root;

  public static void main(String[] args) {
    HieghtBalanced_O1 hieghtBalanced_o1 = new HieghtBalanced_O1();
    Hieght hieght = new Hieght();
    hieghtBalanced_o1.root = new Node(150);
    hieghtBalanced_o1.root.left = new Node(80);
    hieghtBalanced_o1.root.left.left = new Node(40);
    hieghtBalanced_o1.root.left.right = new Node(60);
    hieghtBalanced_o1.root.right = new Node(150);
    hieghtBalanced_o1.root.right.right = new Node(180);
    hieghtBalanced_o1.root.right.left = new Node(160);
    if(checkBalanced(hieghtBalanced_o1.root,hieght)) {
      System.out.println("Balanced....");
    }
    else
      System.out.println("Not balanced ..");
  }

  /**
   * need to implement method
   * @param root
   * @param hieght
   * @return
   */
  private static boolean checkBalanced(Node root, Hieght hieght) {
    if(root == null) {
      hieght.hieght = 0;
      return true;
    }
    Hieght lhight = new Hieght();
    Hieght rhieght = new Hieght();
    boolean lb = checkBalanced(root.left,lhight);
    boolean rb = checkBalanced(root.right ,rhieght);
    int lh = lhight.hieght;
    int rh = rhieght.hieght;
    hieght.hieght =(lh>rh?lh:rh)+1;
    if(lh -rh >= 2 || rh-lh >= 2)
      return false;
    else
    return lb && rb;
  }
}
