package by.epam_pre_training.task6.model.stack;

import by.epam_pre_training.task6.exceptions.StackEmptyException;
import by.epam_pre_training.task6.exceptions.StackOverflowException;

public class MyStackFixedSizeArray<E> implements AbstractMyStack<E> {

    private final static int DEFAULT_SIZE = 10;
    private E[] array;
    private int size;
    private int top;

    public MyStackFixedSizeArray(int size) {
        array = (E[]) new Object[this.size = size];
        top = -1;
    }


    public MyStackFixedSizeArray() {
        this(DEFAULT_SIZE);
    }


    @Override
    public int size() {
        return top + 1;
    }


    @Override
    public boolean isEmpty() {
        return top == -1;
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
        return array[top];
    }


    @Override
    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        E element = array[top];
        array[top--] = null;
        return element;
    }


    public void push(E element) throws StackOverflowException {
        if (size() == size) {
            throw new StackOverflowException("The stack is overflown!");
        }
        array[++top] = element;
    }
}
