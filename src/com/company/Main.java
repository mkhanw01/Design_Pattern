package com.company;

public class Main {
    Node root;
    Main(){
        root=null;
    }
    void preOrder(Node node){
        if(null!=node){
            System.out.print(" "+node.key);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+node.key);
        }
    }
    void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(" "+node.key);
            inOrder(node.right);
        }
    }
void preOrder(){
    preOrder(root);
}
    void postOrder(){
        postOrder(root);
    }
    void inOrder(){
        inOrder(root);
    }
    public static void main(String[] args) {
     Main tree=new Main();
        tree.root=new Node(100);
        tree.root.left=new Node(20);
        tree.root.right=new Node(200);
        tree.root.left.left=new Node(10);
        tree.root.right.right=new Node(300);
        System.out.println("InOrder Traversal..");
        tree.inOrder();
        System.out.println("preOrder Traversal..");
        tree.preOrder();
        System.out.println("PostOrder Traversal..");
        tree.postOrder();
	// write your code here
    }

}
