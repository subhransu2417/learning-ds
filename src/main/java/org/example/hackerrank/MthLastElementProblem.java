package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MthLastElementProblem {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int elem;

        LinkedList L = new LinkedList();
        String[] numberList = new String[0];
        String line;

        while ((line = br.readLine()) != null) {
            numberList = line.split("\\s+");
        }
        for (String num : numberList) {
            elem = Integer.parseInt(num);

            if (L.size() >= M)
                L.replace_top(elem);
            else L.add(elem);
        }
        long r = L.findKthToLast(M);

        if (r == -1)
            System.out.println("NIL");
        else System.out.println(r);
    }
}


class LinkedList {
    Node head;
    Node last;
    long size;

    LinkedList() {
        size = 0;
    }

    void add(long elem) {
        Node n = new Node(elem);
        size++;

        if (size == 1) {
            head = last = n;
        } else {
            last.next = n;
            last = last.next;
        }
    }

    void replace_top(long elem) {
        if (head == null) return;
        last.next = head;
        last = last.next;
        head = head.next;
        last.next = null;
        last.data = elem;
        size++;
    }

    long size() {
        return size;
    }

    long findKthToLast(long k) {
        long toFind = size - k + 1;

        // System.out.println(toFind);
        if (toFind <= 0 || k <= 0)
            return -1;
        return head.data;
    }

    void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class Node {
    long data;
    Node next;

    Node(long data) {
        this.data = data;
    }
}
