package co.edu.uptc.utils;

public class AVLTree {

    private Node root;

    public AVLTree() {
    }

    public AVLTree(Node root) {
        this.root = root;
    }



    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
