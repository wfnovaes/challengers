package datastructure.vector;

import java.util.Arrays;

public class MyList<T> {

    private T[] elements;
    private int size;

    public MyList(int size) {
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }

    public MyList(){
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    public T get(int index) {
        validadeIndex(index);
        return this.elements[index];
    }

    public int getIndex(T element) {
        for (int index = 0; index < this.size; index++) {
            if (this.elements[index].equals(element)) return index;
        }
        return -1;
    }

    public boolean contain(T element) {
        return getIndex(element) >= 0;
    }

    public void add(T item) {
        expandSize();
        this.elements[this.size++] = item;
    }

    public void addAtPosition(int index, T item) {
        validadeIndex(index);
        expandSize();
        for (int i = this.size; i >= index; i --) {
            this.elements[i+1] = this.elements[i];
        }
        this.size ++;
    }

    public void remove(int index) {
        validadeIndex(index);
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i+1];
        }
        this.size --;
    }

    public int size() {
        return this.size;
    }

    public int lastIndexOf(T element) {
        for (int index = this.size -1; index >= 0; index--) {
            if(this.elements[index].equals(element)) return index;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int index = 0; index < this.size -1; index++) {
            sb.append(this.elements[index]);
            sb.append(", ");
        }
        if (this.size > 0) {
            sb.append(this.elements[this.size -1]);
        }
        sb.append("]");
        return sb.toString();
    }

    private void expandSize() {
        if (this. size < this.elements.length) return;

        T[] newElements = (T[]) new Object[this.size*2];
        System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
        this.elements = newElements;
    }

    private void validadeIndex(int index) {
        if (index < 0 && index >= this.size ) throw new IndexOutOfBoundsException("Invalid Position");
    }

}
