package homework_11;

public class MyArray<T> {
    private Object[] elements;
    private int size;
    private final int capacity = 10;

    public MyArray() {
        elements = new Object[capacity];
        size = 0;
    }

    public MyArray(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void addElement(T element) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size] = element;
        size++;
    }

    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        Object[] newArray = new Object[newCapacity];

        for (int index = 0; index < elements.length; index++) {
            newArray[index] = elements[index];
        }
        elements = newArray;
    }

    public T getElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Ошибка: индекс вне границ");
            return null;
        }
        return (T) elements[index];
    }

    public void removeElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Ошибка: индекс вне границ");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    public boolean containsElement(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clearArray() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
    }

    public int size () {
        return size;
    }
}
