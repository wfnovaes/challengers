package datastructure.stack;

import datastructure.Structure;

public class MyStack<T> extends Structure<T> {

    public MyStack(int size) {
        super(size);
    }

    public MyStack() {
        super();
    }

    public void push(T item) {
        add(item);
    }

    public T pop() {
        if (isEmpty()) return null;
        T element = this.elements[this.size - 1];
        remove(this.size-1);
        return element;
    }

    public T peek() {
        if (isEmpty()) return null;
        return this.elements[size - 1];
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
