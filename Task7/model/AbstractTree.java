package by.epam_pre_training.task7.model;

import by.epam_pre_training.task7.exceptions.EmptyTreeException;

public interface AbstractTree<E> {

    void add(E data);
    boolean contains(E data) throws EmptyTreeException;
    void remove(E data) throws EmptyTreeException;
    void clear();
    int size();
    String traversePreOrder();
    String traversePostOrder();
    String traverseInOrder();
}
