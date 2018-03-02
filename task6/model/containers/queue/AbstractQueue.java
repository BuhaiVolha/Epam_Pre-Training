package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.LogicTask6Exception;
import by.epam_pre_training.task6.exceptions.QueueEmptyException;
import by.epam_pre_training.task6.exceptions.QueueOverflowException;

public interface AbstractQueue<E> {

    void enqueue(E element) throws QueueOverflowException;
    E dequeue() throws QueueEmptyException;
    E peek() throws LogicTask6Exception;
    int size();
    boolean isEmpty();
    boolean isFull();
}

