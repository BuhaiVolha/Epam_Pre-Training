package by.epam_pre_training.task6.model.stack;

import by.epam_pre_training.task6.exceptions.StackEmptyException;

public interface AbstractMyStack<E> {

    void push(E element);
    E pop() throws StackEmptyException;
    E peek() throws StackEmptyException;
    int size();
    boolean isEmpty();
    boolean isFull();
}
