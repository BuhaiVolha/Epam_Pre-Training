package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.QueueEmptyException;
import by.epam_pre_training.task6.exceptions.QueueOverflowException;

public class QueueFixedSizeArrayBased<E> extends QueueBase<E> {

    @SuppressWarnings("unchecked")
    public QueueFixedSizeArrayBased(int size) {
        array = (E[]) new Object[size];
        first = 0;
        last = -1;
        top = 0;
    }

    @Override
    public void enqueue(E element) throws QueueOverflowException {
        if (isFull()) {
            throw new QueueOverflowException("The queue is full!");
        }
        last = (last + 1) % array.length;
        array[last] = element;
        top++;
    }


    @Override
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The queue is empty!");
        }
        E toBeDeleted = array[first];
        array[first] = null;
        first = (first + 1) % array.length;
        top--;
        return toBeDeleted;
    }
}
