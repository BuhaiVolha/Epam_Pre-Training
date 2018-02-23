package by.epam.buhai.task6.model;

public interface AbstractMyQueue<E> {

    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
    boolean isFull();
}
