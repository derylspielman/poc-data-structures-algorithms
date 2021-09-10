package com.derylspielman.datastructures;

/**
 *
 */
public class DoublyLinkedList<T> {

    private Node<T> head;

    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(T data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        if (head == null) {
            head = node;
        } else {
            node.setPrevious(head);
        }
        size++;
    }

}
