package org.example.ds;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.setValue(data);
        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.setNext(first);
        }
        first.setPrevious(newNode);
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.setValue(data);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
        }
        last = newNode;
    }

    public int deleteFirst(){
        Node temp = first;
        if(first.getNext() == null){
            first = null;
        } else {
            first.getNext().setPrevious(null);
        }
        first = first.getNext();
        return temp.getValue();
    }

    public int deleteLast(){
        Node temp = last;
        if(first.getNext() == null){ //we only have one node
            first = null;
        } else {
            last.getPrevious().setNext(null); //the last node previous node will point node
        }
        last = last.getPrevious();
        return temp.getValue();
    }

    public boolean insertAfter(int key, int data){
        Node current = first;
        while(current.getValue() != key){
            current = current.getNext();
            if(current == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.setValue(data);
        if(current.getNext() == last){
            current.setNext(newNode);
            newNode.setPrevious(current);
            newNode.setNext(null);
        } else {
            newNode.setPrevious(current);
            newNode.setNext(current.getNext());
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
        }
        return true;
    }

    public boolean insertBefore(int key, int data){
        Node current = last;
        while(current.getValue() != key){
            current = current.getNext();
            if(current == null){
                return false;
            }
        }
        Node newNode = new Node();
        newNode.setValue(data);
        if(current.getNext() == last){
            current.setNext(newNode);
            newNode.setPrevious(current);
            newNode.setNext(null);
        } else {
            newNode.setPrevious(current);
            newNode.setNext(current.getNext());
            current.getNext().setPrevious(newNode);
            current.setNext(newNode);
        }
        return true;
    }
}
