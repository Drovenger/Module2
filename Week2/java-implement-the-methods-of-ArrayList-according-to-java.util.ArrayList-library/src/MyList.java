import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    void add(int index, E element) {
        if (size == 0) {
            ensureCapacity(1);
            elements[size++] = element;
        } else if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            ensureCapacity(1);
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    E remove(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        E temp = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements = Arrays.copyOf(elements, size);
        return temp;
    }

    int size() {
        return size;
    }

    protected E clone() {
        Object copyOfElements[] = Arrays.copyOf(elements, elements.length);
        return (E) Arrays.toString(copyOfElements);
    }

    boolean contains(E o) {
        int i;
        boolean bo = true;
        for (i = 0; i < elements.length; i++) {
            if (o == elements[i]) {
                break;
            }
        }
        if (i == elements.length) {
            bo = false;
        }
        return bo;
    }

    int indexOf(E o) {
        int i;
        for (i = 0; i < elements.length; i++) {
            if (o == elements[i]) {
                break;
            }
        }
        if (i == elements.length) {
            i = -1;
        }
        return i;
    }

    boolean add(E e) {
        ensureCapacity(2);
        elements[size++] = e;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (size == elements.length) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    E get(int i) {
        int index;
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        for (index = 0; index < elements.length; index++) {
            if (index == i) {
                break;
            }
        }
        return (E) elements[index];
    }

    void clear() {
        size = 0;
    }
}