package models;

public class List {
    private Node first;
    private Node last;

    public List() {
        first = null;
        last = null;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            setLast(node);
        } else {
            node.setNext(first);
        }
        setFirst(node);
    }

    public int removeFirst() {
        int value = first.getValue();
        if (first == last) {
            setLast(null);
        }
        setFirst(first.getNext());
        return value;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            setFirst(node);
        } else {
            last.setNext(node);
        }
        setLast(node);
    }

    public int removeLast() {
        int value = last.getValue();

        if (first.getNext() == null) {
            setFirst(null);
            setLast(null);
        } else {
            Node aux = first;
            while (aux.getNext() != last) {
                aux = aux.getNext();
            }
            aux.setNext(null);
            setLast(aux);
        }

        return value;
    }

    @Override
    public String toString() {
        String s = "";

        if (isEmpty()) {
            s += "Empty list.";
        } else {
            Node aux = first;
            while (aux != null) {
                s += aux.getValue() + " ";
                aux = aux.getNext();
            }
        }

        return s;
    }
}
