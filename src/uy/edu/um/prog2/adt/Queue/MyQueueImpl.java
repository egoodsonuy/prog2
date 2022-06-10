package LinkedList.src.uy.edu.um.prog2.adt.Queue;


import LinkedList.src.uy.edu.um.prog2.adt.LinkedList.Node;
import LinkedList.src.uy.edu.um.prog2.adt.LinkedList.MiLinkedList;
import LinkedList.src.uy.edu.um.prog2.adt.Queue.EmptyQueueException;


public class MyQueueImpl<T> implements MyQueue<T> {
    private Node<T> first;
    private Node<T> last;

    public MyQueueImpl() {
        this.first = null;
        this.last = null;
    }


    public void enqueue(T value) {
        Node nuevoNodo = new Node(value);
        if (first==null){
            first=nuevoNodo;
            last=nuevoNodo;
            nuevoNodo.next=null;
        }
        else {
            last.next=nuevoNodo;
            last=nuevoNodo;
            nuevoNodo.next=null;
        }
    }

    public T dequeue() throws EmptyQueueException {
        if (this.last == null) {
            throw new EmptyQueueException();
        }
        return removeLast();
    }



    public void remove(T value) {
        Node<T> Temp = this.first;
        while (Temp.getNext() != null && Temp.getValue() != value) {
            Temp = Temp.getNext();
        }
        if (Temp.getValue() == value && Temp.getNext() == null) {
            Temp = Temp.getPrev();
            Temp.setNext(null);
        } else if (Temp.getValue() == value) {
            Temp = Temp.getPrev();
            Temp.setNext(Temp.getNext().getNext());
        }
    }


    private T removeLast() {
        T valueToRemove = null;
        if (this.last != null) {
            valueToRemove = this.last.getValue();
            remove(valueToRemove);
        }
        return valueToRemove;
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
