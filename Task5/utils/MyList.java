package by.epam_pre_training.task5.utils;

import java.util.Collection;
import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    int size();

    boolean add(E element);

    void add(E element, int index);

    boolean addAll(int index, Collection<? extends E> c);

    E get(int index);

    E set(E element, int index);

    E remove(int index);

    int indexOf(Object obj);

    boolean contains(Object obj);

    void clear();

    boolean isEmpty();

    public Object[] toArray();

    public <T> T[] toArray(T[] a);

    Iterator<E> iterator();
}
