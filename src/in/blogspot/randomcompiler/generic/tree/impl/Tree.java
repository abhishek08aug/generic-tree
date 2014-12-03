package in.blogspot.randomcompiler.generic.tree.impl;

import java.util.ArrayList;
import java.util.List;

public class Tree<T extends Comparable> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }
    
    public void printAllPaths() {
        if(root == null)
            return;
        printAllPaths(root, new ArrayList<T>());
    }

    private void printAllPaths(Node<T> node, List<T> nodeList) {
        nodeList.add(node.getData());
        if(node.getLeft() == null && node.getRight() == null) {
            print(nodeList);
        }
        
        if(node.getLeft() != null) {
            printAllPaths(node.getLeft(), nodeList);
            nodeList.remove(nodeList.size()-1);
        }
        if(node.getRight() != null) {
            printAllPaths(node.getRight(), nodeList);
            nodeList.remove(nodeList.size()-1);
        }
    }

    private void print(List<T> nodeList) {
        for(T t : nodeList) {
            System.out.print("[" + t + "] ");
        }
        System.out.println();
    }

    public void countLeaves() {
        System.out.println("No. of leaves in the tree: " + countLeaves(root));
    }

    private int countLeaves(Node<T> node) {
        if(node == null) {
            return 0;
        }
        int subtreeCount = countLeaves(node.getLeft()) + countLeaves(node.getRight());
        if(subtreeCount == 0) {
            return 1;
        } else {
            return subtreeCount;
        }
    }
    
    public void isBST() {
        System.out.println(isBST(root) ? "YES" : "NO");
    }

    private boolean isBST(Node<T> node) {
        if(node == null) {
            return true;
        }
        if(node.getLeft() != null && node.getLeft().getData().compareTo(node.getData()) > 0) {
            return false;
        }
        if(node.getRight() != null && node.getRight().getData().compareTo(node.getData()) <= 0) {
            return false;
        }
        boolean leftIsBST = isBST(node.getLeft());
        boolean rightIsBST = isBST(node.getRight());
        if(leftIsBST && rightIsBST) {
            return true;
        }
        return false;
    }
}
