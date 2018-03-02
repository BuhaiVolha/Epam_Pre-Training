package by.epam_pre_training.task6.model.containers.stack;

public class StackDynamicArrayBased<E> extends StackBase<E> {

    @SuppressWarnings("unchecked")
    public StackDynamicArrayBased(int size) {
        array = (E[]) new Object[size];
        top = 0;
    }

    public StackDynamicArrayBased() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void push(E element) {
        if (size() == array.length) {
            expand();
        }
        array[top] = element;
        top++;
    }


    @SuppressWarnings("unchecked")
    private void expand() {
        E[] newArray = (E[]) new Object[array.length * 2];

        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
