package org.example.ds;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char value) {
        top++;
        stackArray[top] = value;
    }

    public char pop() {
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize);
    }
}
