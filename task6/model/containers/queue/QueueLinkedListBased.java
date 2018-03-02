package by.epam_pre_training.task6.model.containers.queue;

import by.epam_pre_training.task6.exceptions.QueueEmptyException;
import by.epam_pre_training.task6.model.containers.LinkedListBase;

public class QueueLinkedListBased<E> extends LinkedListBase<E> implements AbstractQueue<E> {

    public QueueLinkedListBased() {
        first = null;
        last = null;
        size = 0;
    }


    @Override
    public void enqueue(E element) {
        Cell newCell = new Cell(element);

        if (isEmpty()) {
            first = newCell;
        } else {
            last.next = newCell;
        }
        newCell.previous = last;
        last = newCell;
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
