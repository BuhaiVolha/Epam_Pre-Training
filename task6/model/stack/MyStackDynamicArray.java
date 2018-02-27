package by.epam_pre_training.task6.model.stack;

import by.epam_pre_training.task6.exceptions.StackEmptyException;

public class MyStackDynamicArray<E> implements AbstractMyStack<E>  {
    private final static int DEFAULT_SIZE = 10;
    private int size;
    private E[] array;
    private int top;


    public MyStackDynamicArray(int size) {
        this.size = size;
        this.array = (E[]) new Object[this.size];
        this.top = -1;
    }


    @Override
    public int size() {
        return top + 1;
    }

    public MyStackDynamicArray() {
        this(DEFAULT_SIZE);
    }


    @Override
    public void push(E element) {
        if(isFull()){
            expand();
        }
        array[++top] = element;
    }


    @Override
    public E pop() throws StackEmptyException {

        if(isEmpty()){
            throw new StackEmptyException("The stack is empty!");
        }
        E element = array[top];
        array[top--] = null;
        return element;
    }


    @Override
    public E peek() throws StackEmptyException {

        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        return array[top];
    }


    private void expand(){
        E[] newStack = (E[]) new Object[size * 2];

        for (int i = 0; i < size; i++) {
            newStack[i] = array[i];
        }
        array = newStack;
        size = size * 2;
    }


    @Override
    public boolean isEmpty() {
        return (top == -1);
    }


    @Override
    public boolean isFull() {
        return (top == size - 1);
    }
}
