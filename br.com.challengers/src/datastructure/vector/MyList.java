package datastructure.vector;

import datastructure.Structure;

public class MyList<T> extends Structure<T> {

    public MyList(){
        super();
    }

    public MyList(int size) {
        super(size);
    }

    public T get(int index) {
        validadeIndex(index);
        return this.elements[index];
    }

    public void add(T item) {
        super.add(item);
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
        super.remove(index);
    }

    public int lastIndexOf(T element) {
        for (int index = this.size -1; index >= 0; index--) {
            if(this.elements[index].equals(element)) return index;
        }
        return -1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
