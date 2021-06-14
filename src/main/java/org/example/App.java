package org.example;

import org.example.ds.*;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //System.out.println(reverseString("subhransu"));
        //operationQueue();

        //operationLinkedList();
        //operationSinglyLinkList();
        //operationCircularLinkedList();
    }

    private static void operationCircularLinkedList() {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(11);
        circularLinkedList.insertFirst(12);
        circularLinkedList.insertFirst(13);
        circularLinkedList.insertFirst(14);
        circularLinkedList.insertFirst(15);
        circularLinkedList.insertLast(22);
        circularLinkedList.insertLast(22);
        circularLinkedList.insertLast(22);
        circularLinkedList.insertFirst(33);
        circularLinkedList.insertFirst(33);
        circularLinkedList.displayList();
    }

    private static void operationSinglyLinkList() {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(12);
        myList.insertFirst(13);
        myList.insertFirst(14);
        myList.insertFirst(15);
        myList.insertFirst(16);
        myList.insertFirst(17);
        myList.insertLast(11);
        myList.displayList();
    }

    private static void operationLinkedList() {
        Node nodeA = new Node();
        nodeA.setValue(4);

        Node nodeB = new Node();
        nodeB.setValue(3);

        Node nodeC = new Node();
        nodeC.setValue(7);

        Node nodeD = new Node();
        nodeD.setValue(8);


        //make a reference to the next node
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
        System.out.println(listLength(nodeC));
        System.out.println(listLength(nodeD));


    }

    private static void operationQueue() {
        Queue queue = new Queue(10);
        queue.insert(10);
        queue.insert(11);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        System.out.println(queue.view());
    }

    public static int listLength(Node node) {
        int count = 0;
        Node curNode = node;
        while (null != curNode.getNext()) {
            count++;
            curNode = curNode.getNext();
        }
        return count;
    }

    public static String reverseString(String str) {
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reverseStr = new StringBuilder();
        while (!stack.isEmpty()) {
            char reverseChar = stack.pop();
            reverseStr.append(reverseChar);
        }
        return reverseStr.toString();
    }
}
