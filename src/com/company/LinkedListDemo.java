package com.company;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList(new Node(12, null ));
        ls.add(new Node(20, null ));
        ls.add(new Node(15, null ));
        ls.display();
    }
}
