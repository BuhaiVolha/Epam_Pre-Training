package by.epam_pre_training.task6.model.stack;

import by.epam_pre_training.task6.exceptions.StackEmptyException;

public class MyStackLinkedList<E> implements AbstractMyStack<E> {

    private Node head;
    private int size;

    private class Node {
        E element;
        Node next;
    }

    public MyStackLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public E pop() {
        E item = head.element;
        head = head.next;
        size--;
        return item;
    }

    @Override
    public void push(E element) {
        Node oldHead = head;
        head = new Node();
        head.element = element;
        head.next = oldHead;
        size++;
    }

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isFull() {
        return size() == size;
    }


    @Override
    public E peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        return head.element;
    }
}
