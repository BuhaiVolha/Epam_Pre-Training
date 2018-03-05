package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.QueueEmptyException;

public class QueueDynamicSizeArrayBased<E> extends QueueBase<E> {

    public QueueDynamicSizeArrayBased(){
        this(DEFAULT_CAPACITY);
        top = 0;
        first = 0;
        last = 0;
    }

    @SuppressWarnings("unchecked")
    public QueueDynamicSizeArrayBased(int size){
        array = (E[]) new Object[size];
    }

    @Override
    public void enqueue(E element) {

        if (isFull()) {
            resize(2 * array.length);
        }
        array[last++] = element;
        if (last == array.length) {
            last = 0;
        }
        top++;
    }


    @Override
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The queue is empty!");
        }
        E element = array[first];
        array[first] = null;
        top--;
        first++;

        if (first == array.length) {
            first = 0;
        }
        if ((top > 0)
                && (top == (array.length / 4))) {
            resize(array.length / 2);
        }
        return element;
    }


    @SuppressWarnings("unchecked")
    private void resize(int size){
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < top; i++) {
            newArray[i] = array[(first + i) % array.length];
        }
        array = newArray;
        first = 0;
        last = top;
    }
}
