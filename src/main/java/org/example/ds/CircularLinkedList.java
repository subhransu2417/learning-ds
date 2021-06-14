package org.example.ds;

public class CircularLinkedList {
    private Node firstNode;
    private Node lastNode;

    public CircularLinkedList() {
        firstNode = null;
        lastNode = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.setValue(data);
        if (isEmpty()) {
            lastNode = newNode;
        }
        newNode.setNext(firstNode);
        firstNode = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.setValue(data);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
        } else if(firstNode.getNext() == lastNode){
            firstNode = null;
            lastNode = null;
        } else {
            firstNode = firstNode.getNext();
        }
    }

    public void displayList() {
        Node currentNode = firstNode;
        while(currentNode.getNext() != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public boolean isEmpty() {
        return firstNode == null;
    }
}
