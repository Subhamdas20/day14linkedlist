package com.bz.linkedlist;

public class MyNode<T> {
    private MyNode next;
    private T key;

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode(int key) {
        this.key = null;
        this.next = null;
    }
}

