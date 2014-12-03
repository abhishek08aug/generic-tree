package in.blogspot.randomcompiler.generic.tree.demo;

import in.blogspot.randomcompiler.generic.tree.impl.Node;
import in.blogspot.randomcompiler.generic.tree.impl.Tree;

public class CheckBSTDemo {

    public static void main(String[] args) {
        Tree<Integer> t1 = new Tree<Integer>();
        Node<Integer> n1 = new Node<Integer>();
        n1.setData(1);
        t1.setRoot(n1);
        
        Node<Integer> n2 = new Node<Integer>();
        n2.setData(2);
        n1.setLeft(n2);
        
        Node<Integer> n3 = new Node<Integer>();
        n3.setData(3);
        n1.setRight(n3);
        
        Node<Integer> n4 = new Node<Integer>();
        n4.setData(4);
        n2.setLeft(n4);    
        
        Node<Integer> n5 = new Node<Integer>();
        n5.setData(5);
        n2.setRight(n5);  
        
        Node<Integer> n6 = new Node<Integer>();
        n6.setData(6);
        n3.setLeft(n6); 
        
        Node<Integer> n7 = new Node<Integer>();
        n7.setData(7);
        n3.setRight(n7);
        
        Node<Integer> n8 = new Node<Integer>();
        n8.setData(8);
        n5.setRight(n8);
        
        t1.isBST();
    }

}
