package by.epam_pre_training.task6.model.containers.stack;

import by.epam_pre_training.task6.exceptions.LogicTask6Exception;
import by.epam_pre_training.task6.exceptions.StackEmptyException;

public abstract class StackBase<E> extends ArrayBase<E> implements AbstractStack<E> {

    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        top--;
        E element = array[top];
        array[top] = null;
        return element;
    }


    public E peek() throws LogicTask6Exception {
        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        return array[top - 1];
    }
}
