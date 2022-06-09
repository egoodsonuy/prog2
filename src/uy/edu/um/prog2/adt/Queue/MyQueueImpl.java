package LinkedList.src.uy.edu.um.prog2.adt.Queue;

import uy.edu.um.prog2.adt.LinkedList.Node;

public class MyQueueImpl<T> implements MyQueue {
    private Node<T> first;
    private Node<T> last;

    public MyQueueImpl() {
        this.first = null;
        this.last = null;
    }

    public void enqueue(T value) {
        Node nuevoNodo = new Node(element);
        if (first==null){
            first=nuevoNodo;
            last=nuevoNodo;
            nuevoNodo.Next=null;
        }
        else {
            last.Next=nuevoNodo;
            last=nuevoNodo;
            nuevoNodo.Next=null;
        }
    }

    public T dequeue() throws EmptyQueueException {
        if (this.last == null) {
            throw new EmptyQueueException();
        }
        return removeLast();
    }

    public boolean contains(T value) {
        boolean contains = false;
        Node<T> temp = this.first;
        while (temp != null && !temp.getValue().equals(value)) {
            temp = temp.getNext();
        }
        if (temp != null) {
            contains = true;
        }
        return contains;
    }

    public int size() {
        int size = 0;
        Node<T> temp = this.first;
        while (temp != null) {
            temp = temp.getNext();
            size++;
        }
        return size;
    }
}
