package by.epam_pre_training.task5.container;

import java.util.*;

public class DynamicArray<E> implements Iterable<E>, MyList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    // The number of elements
    private int size;

    // The storage for the elements.
    private Object[] array;

    // Constructor for an empty DynamicArray
    public DynamicArray() {
        array = new Object[DEFAULT_CAPACITY];
    }


    // Constructor for an empty DynamicArray with the
    // specified initial capacity.
    public DynamicArray(int initialCapacity) {
        if (initialCapacity > 0) {
            array = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    // Constructor for a dynamic array from given array
    public DynamicArray(E[] inputArray) {
        this(inputArray.length + DEFAULT_CAPACITY);

        for (int i = 0; i < inputArray.length; i++) {
            array[i] = inputArray[i];
            size++;
        }
    }


    //Add element to the end of the list
    @Override
    public boolean add(E element) {
        ensureCapacity(size + 1);
        array[size++] = element;
        return true;
    }


    // Add element at specific index, from 0 to size
    @Override
    public void add(E element, int index) {
        if (index == size) {
            add(element);
        } else {
            checkRangeForAdd(index);
            ensureCapacity(size + 1);
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = element;
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        checkRangeForAdd(index);
        boolean modified = false;
        for (E e : c) {
            add(e, index++);
            modified = true;
        }
        return modified;
    }


    private void ensureCapacity(int minCapacity) {
        int oldCapacity = array.length;

        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 2);
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            array = Arrays.copyOf(array, newCapacity);
        }
    }


    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }
    }


    private void checkRangeForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }
    }


    // Return size of the list
    @Override
    public int size() {
        return size;
    }


    // Check if the list is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    // Get an element by it's index
    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        checkRange(index);
        return (E) array[index];
    }


    @Override
    public E set(E element, int index) {
        checkRange(index);
        E value = get(index);
        array[index] = element;
        return value;
    }


    // Remove item at specific index
    @SuppressWarnings("unchecked")
    @Override
    public E remove(int index) {
        checkRange(index);
        E value = (E) array[index];
        int numberToMove = size - index - 1;

        if (numberToMove > 0) {
            System.arraycopy(array, index + 1, array, index, numberToMove);
        }
        array[--size] = null;
        return value;
    }


    // Return -1 if object is not found
    @Override
    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (obj.equals(array[i])) return i;
            }
        }
        return -1;
    }


    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }


    // Clear all elements from the list
    // and return size to 0
    @Override
    public void clear() {

        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    // Convert to an array of obj
    @Override
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    // Convert to an array of E elements
    @SuppressWarnings("unchecked")
    @Override
    public <E> E[] toArray(E[] a) {
        return (E[]) Arrays.copyOf(array, size, a.getClass());
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int cursor = 0;

            @Override
            @SuppressWarnings("unchecked")
            public E next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException("No more elements available.");
                }
                E value = (E) array[cursor];
                cursor++;
                return value;
            }

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public void remove() {
                checkRange(--cursor);
                DynamicArray.this.remove(cursor);
            }
        };
    }
}
