package com.bz.linkedlist;
public class MyLinkedList<T>  {
    public INode tail;
    public INode head;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(INode newNode) {
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }
        else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode newNode) {
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    public void insert(INode myNode, INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public void pop(){
        this.head = head.getNext();
    }
    public <T>INode popLast(){
        INode tempNode = this.head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }
    public  INode findNode(T key){
        INode tempNode = this.head;
        INode temp = null;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
            if(tempNode.getKey()==key){
                System.out.println("Found node with key : "+key);
                temp=tempNode;
            }
        }
        return temp;
    }
    public INode searchAndInsert( T keySearched , INode keyToInsert){
        INode tempNode = this.head;
        INode temp = null;
        INode tempInsert = keyToInsert;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
            if(tempNode.getKey()==keySearched){
//                System.out.println("Found node with key : "+keySearched);
                temp=tempNode;
            }
        }
        tempInsert.setNext(temp.getNext());
        tempInsert.setKey(keyToInsert.getKey());
        temp.setNext(tempInsert);
        return tempInsert;
    }
    public INode delete(INode node){
        INode tempNode = this.head;
        INode temp = null;
        while (!tempNode.getNext().equals(node)) {
            tempNode = tempNode.getNext();
                temp=tempNode;
        }
       temp.setNext(node.getNext());
        return temp.getNext();
    }
    public void size(INode node){
        INode tempNode = this.head;
        int size=1;
        while (!tempNode.getNext().equals(node)) {
            tempNode = tempNode.getNext();
           size=size+1;
        }
        System.out.println(size+1);

    }
    public void printNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes : ");
        INode tempNode = head ;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}

