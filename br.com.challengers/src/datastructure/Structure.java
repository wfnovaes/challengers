package datastructure;

public abstract class Structure<T> {

    protected T[] elements;
    protected int size;

    public Structure(int size) {
        this.elements = (T[]) new Object[size];
        this.size = 0;
    }

    public Structure(){
        this.elements = (T[]) new Object[10];
        this.size = 0;
    }

    public int size() {
        return this.size;
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

    public boolean isEmpty() {
        return size < 1;
    }

    protected void add(T item) {
        expandSize();
        this.elements[this.size++] = item;
    }

    protected void validadeIndex(int index) {
        if (index < 0 && index >= this.size ) throw new IndexOutOfBoundsException("Invalid Position");
    }

    protected void expandSize() {
        if (this. size < this.elements.length) return;

        T[] newElements = (T[]) new Object[this.size*2];
        System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
        this.elements = newElements;
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

}
