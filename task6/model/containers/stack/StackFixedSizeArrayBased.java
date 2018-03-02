package by.epam_pre_training.task6.model.containers.stack;

import by.epam_pre_training.task6.exceptions.StackOverflowException;

public class StackFixedSizeArrayBased<E> extends ArrayBase<E> implements AbstractStack<E> {

    @SuppressWarnings("unchecked")
    public StackFixedSizeArrayBased(int size) {
        array = (E[]) new Object[size];
        top = 0;
    }


    @Override
    public void push(E element) throws StackOverflowException {
        if (isFull()) {
            throw new StackOverflowException("The Stack is full!");
        }
        array[top++] = element;
    }
}
