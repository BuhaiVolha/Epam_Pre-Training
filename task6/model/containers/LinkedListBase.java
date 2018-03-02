package by.epam_pre_training.task6.model.containers;

public abstract class LinkedListBase<E> {

    protected int size;
    protected Cell first;
    protected Cell last;


    public class Cell {
        public E value;
        public Cell next;
        public Cell previous;

        public Cell(E element) {
            value = element;
        }
    }


    public int size() {
        return size;
    }



    public boolean isEmpty() {
        return first == null;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();

        while (!isEmpty()) {
            s.append("[" + first.value + "] ");
            first = first.next;
        }
        return s.toString();
    }


    public String toStringRecursive() {
        return makeString(first).toString();
    }


    private StringBuilder makeString(Cell cell) {
        StringBuilder s = new StringBuilder();

        if (cell == null) {
            return s.append("");
        }
        s.append("[" + cell.value + "] ");
        s.append(makeString(cell.next));
        return s;
    }
}
