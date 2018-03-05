package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.QueueEmptyException;
import by.epam_pre_training.task6.model.containers.stack.ArrayBase;

public abstract class QueueBase<E> extends ArrayBase<E> implements AbstractQueue<E> {

    protected int first;
    protected int last;


    @Override
    public E peek() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The queue is empty!");
        }
        return array[first];
    }
}
