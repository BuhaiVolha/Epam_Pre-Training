package by.epam_pre_training.task6.model.containers.stack;

import by.epam_pre_training.task6.exceptions.StackEmptyException;
import by.epam_pre_training.task6.model.containers.LinkedList;

public class StackLinkedListBased<E> extends LinkedList<E> implements AbstractStack<E> {

    public StackLinkedListBased() {
        first = null;
        last = null;
        size = 0;
    }


    @Override
    public void push(E element) {
        Cell newCell = new Cell(element);

        if (isEmpty()) {
            first = newCell;
        } else {
            last.next = newCell;
            newCell.previous = last;
        }
        last = newCell;
        size++;
    }


    @Override
    public E pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("The stack is empty!");
        }
        Cell toBeDeletedCell = last;
        E toBeDeletedCellValue = last.value;

        if (first == last) {
            first = null;
        } else {
            last.previous.next = null;
        }

        last = last.previous;
        toBeDeletedCell.previous = null;
        size--;
        return toBeDeletedCellValue;
    }


    @Override
    public E peek() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException(("The stack is empty!"));
        }
        return last.value;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
