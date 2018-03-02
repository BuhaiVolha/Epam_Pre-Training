package by.epam_pre_training.task6.model.containers.stack;

public abstract class ArrayBase<E> {

    protected static final int DEFAULT_CAPACITY = 10;
    protected E[] array;
    protected int top;


    public boolean isEmpty() {
        return top <= 0;
    }


    public int size() {
        return top;
    }


    public boolean isFull() {
        return top == array.length;
    }


    public String toString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < top; i++) {
            s.append("[" + array[i] + "]");
        }
        return s.toString();
    }
}
