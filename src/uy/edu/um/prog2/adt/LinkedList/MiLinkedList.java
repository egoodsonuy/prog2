package uy.edu.um.prog2.adt.LinkedList;

public class MiLinkedList<T> implements MyList<T> {

    private Node<T> first;
    private Node<T> last;

    public MiLinkedList() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void add(T value) {
        if (value != null) {
            Node<T> elementToAdd = new Node<>(value);
            if (this.first == null) {
                this.first = elementToAdd;
                this.last = elementToAdd;
            } else {
                this.last.setNext(elementToAdd);
                this.last = elementToAdd;
            }
        } else {
        }
    }

    private void addTFirst(T value) {
        if (value != null) {
            Node<T> elementToAdd = new Node<>(value);
            if (this.first == null) {
                this.first = elementToAdd;
                this.last = elementToAdd;
            } else {
                elementToAdd.setNext(this.first);
                this.first = elementToAdd;
            }
        } else {
        }
    }


    @Override
    public T get(int position) {
        T valueToReturn = null;
        int tempPosition = 0;
        Node<T> temp = this.first;
        while (temp != null && tempPosition != position) {
            temp = temp.getNext();
            tempPosition++;
        }
        if (tempPosition == position) {
            valueToReturn = temp.getValue();
        }
        return valueToReturn;
    }

    @Override
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

    @Override
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
        public void removePos(int position){
            Node<T> Temp = this.first;
            int inicio = 0;
            while (Temp.getNext() != null && inicio < position - 1) {
                Temp = Temp.getNext();
                inicio++;
            }
            Temp.setNext(Temp.getNext().getNext());
        }

        @Override
        public int size () {
            int size = 0;
            Node<T> temp = this.first;
            while (temp != null) {
                temp = temp.getNext();
                size++;
            }
            return size;
        }
    }




