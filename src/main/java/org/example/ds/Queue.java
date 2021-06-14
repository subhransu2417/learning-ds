package org.example.ds;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long item) {
        rear++;
        queueArray[rear] = item;
        nItems++;
    }

    public long peek() {
        return queueArray[front];
    }

    public long remove(){
        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front=0;
        }
        nItems--;
        return temp;
    }

    public String view(){
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = front; i < rear; i++) {
            stringBuffer.append(" "+queueArray[i]);
        }
        return stringBuffer.toString();
    }
}
