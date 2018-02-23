package by.epam.buhai.task6.model;

public class MyQueueArray<E> implements AbstractMyQueue {

    private int capacity = 10;
    private E[] array;
    private int currentElementsAmount;
    private int size;
    private int head;
    private int tail;

    public MyQueueArray(int size) {
        array = (E[]) new Object[this.size = size];
        tail = -1;
        head = 0;
        currentElementsAmount = 0;
    }

    public MyQueueArray() {
        array = (E[]) new Object[capacity];
        tail = -1;
        head = 0;
        currentElementsAmount = 0;
    }

    @Override
    public int size() {
        return currentElementsAmount;
    }

    @Override
    public boolean isEmpty() {
        return currentElementsAmount == 0;
    }

    @Override
    public boolean isFull() {
        return currentElementsAmount == size - 1;
    }

    @Override
    public E peek() {

        return array[tail];
    }

    @Override
    public E dequeue() {
        E temp = array[head++];

        if (head == size) {
            head = 0;
        }
        currentElementsAmount--;
        return temp;
    }

    public void enqueue(Object element) {

        if (tail == size - 1) {
            tail = 0;
        }
        array[++tail] = (E) element;
        currentElementsAmount++;
    }
}
