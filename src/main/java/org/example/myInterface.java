package org.example;

public interface myInterface <E> extends Iterable<E> {
    boolean add(E e);

    E remove(int index);

    boolean remove(Object o);

    boolean contains(Object o);

    int size();

    boolean isEmpty();

    E get(int index);

    void clear();
}
