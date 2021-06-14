package org.example.ds;

public class SinglyLinkedList {
    private Node first;
    private Node last;

    public SinglyLinkedList() {
        first = last;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.setValue(data);
        newNode.setNext(first);
        first = newNode;
    }

    public Node deleteFirst() {
        Node deletedNode = first;
        first = first.getNext();
        return deletedNode;
    }

    public void insertLast(int data){
        Node curNode = first;
        while(curNode.getNext() != null){
            curNode = curNode.getNext();
        }
        Node newNode = new Node();
        newNode.setValue(data);
        curNode.setNext(newNode);
    }

    public void displayList() {
        Node current = first;
        while(current.getNext() != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
