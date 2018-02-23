package by.epam.buhai.task6.model;

import by.epam.buhai.task6.exceptions.StackEmptyException;
import by.epam.buhai.task6.exceptions.StackOverflowException;

public interface AbstractMyStack<E> {

    void push(E element) throws StackOverflowException;
    E pop() throws StackEmptyException;
    E peek() throws StackEmptyException;
    int size();
    boolean isEmpty();
    boolean isFull();
}
