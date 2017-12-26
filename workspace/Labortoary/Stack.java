package Stack;

import java.util.EmptyStackException;
import java.util.Iterator;

/**
 * Created by Ali AL-Saeedi on 9/29/2016.
 */
public class Stack<T> implements Iterator<T> {
    private T stack[];
    private int size;

    public Stack() {
        size = 0;
        stack = null;
    }

    public int size() {
        return size;
    }

    public void push(T t) {
        if (size() == 0) {
            stack = (T[]) (new Object[1]);
            size++;
            stack[0] = t;

        } else {

            T temp[] = (T[]) (new Object[++size]);
            for (int i = 0; i < size - 1; i++) {
                temp[i] = stack[i];
            }
            temp[size - 1] = t;
            stack = temp;

        }
    }

    public T giveElement(int i) {
        T returnValue = stack[i];
        return returnValue;
    }

    public T pop() {
        T returnValue = null;

        try {

            returnValue = stack[size - 1];
            T temp[] = (T[]) (new Object[--size]);
            for (int i = 0; i < size; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        } catch (EmptyStackException e) {

            System.out.println("The stack is empty!!");
        }
        return returnValue;
    }

    public T top() {
        T returnValue = null;

        try {
            returnValue = stack[size - 1];
        } catch (EmptyStackException e) {

            System.out.println("The stack is empty!!");
        }
        return returnValue;
    }

    public void clear() {
        size = 0;
        stack = null;
        System.gc();
    }
}
