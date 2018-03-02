package by.epam_pre_training.task6.model.containers.stack;

import by.epam_pre_training.task6.exceptions.LogicTask6Exception;
import by.epam_pre_training.task6.exceptions.StackEmptyException;
import by.epam_pre_training.task6.exceptions.StackOverflowException;

public interface AbstractStack<E> {

    void push(E element) throws StackOverflowException;
    E pop() throws StackEmptyException;
    E peek() throws LogicTask6Exception;
    int size();
    boolean isEmpty();
    String toString();
    boolean isFull();
}
