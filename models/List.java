package models;

public class List {
    private Node first;

    public List() {
        first = null;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (!isEmpty()) node.setNext(first);
        setFirst(node);
    }

    public int removeFirst() {
        int value = first.getValue();
        setFirst(first.getNext());
        return value;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            setFirst(node);
        } else {
            Node aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(node);
        }
    }

    public int removeLast() {
        int value;

        if (first.getNext() == null) {
            value = first.getValue();
            setFirst(null);
        } else {
            Node aux = first;
            while (aux.getNext().getNext() != null) {
                aux = aux.getNext();
            }
            value = aux.getNext().getValue();
            aux.setNext(null);
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
