package com.company;

public class LinkedList {
    Node head;
    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node newNode) {
        newNode.next = head;
        head = newNode;
    }
    public void delete() {
        head = head.next;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println( temp.value );
            temp = temp.next;
        }
    }
}
