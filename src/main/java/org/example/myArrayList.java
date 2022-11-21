package org.example;

import java.util.Iterator;

public class myArrayList<E> implements myInterface<E> {

    private E[] values;

    myArrayList(){
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length-1] = e;
            return true;
        }catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length-1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex= temp.length - index-1;
            System.arraycopy(temp, index+1, values, index, amountElementsAfterIndex);
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        try {

            int indexOfObject = 0;
            for (int i=0; i< values.length; i++){
                if(values[i] == o){
                    indexOfObject = i;
                    break;
                }
            }

            E[] temp = values;
            values = (E[]) new Object[temp.length-1];

            System.arraycopy(temp, 0, values, 0, indexOfObject);
            int amountElementsAfterIndex= temp.length - indexOfObject-1;
            System.arraycopy(temp, indexOfObject+1, values, indexOfObject, amountElementsAfterIndex);
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i=0; i< values.length; i++){
            if(values[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public boolean isEmpty() {
        return values.length == 0 ? true : false;
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void clear() {
        values = (E[]) new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
