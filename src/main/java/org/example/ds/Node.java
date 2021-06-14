package org.example.ds;

import lombok.Data;

@Data
public class Node {
    private int value;
    private Node next = null;
    private Node previous = null;


}
