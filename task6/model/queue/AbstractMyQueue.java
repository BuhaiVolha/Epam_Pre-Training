package by.epam_pre_training.task6.model.queue;

public interface AbstractMyQueue<E> {

    void enqueue(E element);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
    boolean isFull();
}
