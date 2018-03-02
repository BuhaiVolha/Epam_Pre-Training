package by.epam_pre_training.task6.model.containers;

public class LinkedListBase<E> {

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


    public boolean isFull() {
        return false;
    }


    public boolean isEmpty() {
        return first == null;
    }


    public String toString() {
        Cell current = first;
        StringBuilder s = new StringBuilder();

        while (current != null) {
            s.append("[").append(current.value).append("] ");
            current = current.next;
        }
        return new String(s);
    }


    public String toStringRecursive() {
        return new String(makeString(first));
    }


    private StringBuilder makeString(Cell cell) {
        StringBuilder s = new StringBuilder();

        if (cell == null) {
            return s.append("");
        }
        s.append("[").append(cell.value).append("] ");
        s.append(makeString(cell.next));
        return s;
    }
}
