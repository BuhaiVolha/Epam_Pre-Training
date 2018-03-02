package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.QueueEmptyException;
import by.epam_pre_training.task6.model.containers.LinkedList;

public class QueueLinkedListBased<E> extends LinkedList<E> implements AbstractQueue<E> {

    public QueueLinkedListBased() {
        first = null;
        last = null;
        size = 0;
    }


    @Override
    public void enqueue(E element) {
        Cell newCell = new Cell(element);

        if (isEmpty()) {
            last = newCell;
        } else {
            first.previous = newCell;
        }
        newCell.next = first;
        first = newCell;
        size++;
    }


    @Override
    public E dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("The queue is empty!");
        }
        Cell toBeDeletedCell = first;
        E toBeDeletedCellValue = first.value;

        if (first == last) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        toBeDeletedCell.next = null;

        size--;
        return toBeDeletedCellValue;
    }


    @Override
    public E peek() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException(("The queue is empty!"));
        }
        return first.value;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
