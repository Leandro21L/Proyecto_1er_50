package co.edu.uptc.utils;

import co.edu.uptc.model.Book;

public class Node {

    private Book value;
    private Node leftChild;
    private Node rightChild;
    private int height;

    public Node() {
    }

    public Node(Book value, Node leftChild, Node rightChild, int height) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.height = height;
    }

    public Book getValue() {
        return value;
    }

    public void setValue(Book value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
