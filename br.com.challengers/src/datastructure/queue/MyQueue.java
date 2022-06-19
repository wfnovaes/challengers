package datastructure.queue;

import datastructure.Structure;

public class MyQueue<T> extends Structure<T> {

    public MyQueue(int size) {
        super(size);
    }

    public MyQueue() {
        super();
    }

    public void add(T item){
        this.add(item);
    }

    public T remove() {
        if(this.isEmpty()) return null;
        T element = this.elements[0];
        super.remove(0);
        return element;
    }

    public T peek() {
        if(this.isEmpty()) return null;
        return this.elements[0];
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
