package by.epam_pre_training.task5.container;

import java.util.Collection;
import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    int size();

    boolean add(E element);

    void add(E element, int index);

    boolean addAll(int index, Collection<? extends E> c);

    E get(int index);

    E remove(int index);

    int indexOf(E el);

    boolean contains(E el);

    void clear();

    boolean isEmpty();

    E[] toArray(E[] a);

    Iterator<E> iterator();

}
