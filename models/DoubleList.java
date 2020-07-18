package models;

public class DoubleList {
    private DoubleNode first;

    public DoubleList() {
        setFirst(null);
    }

    public DoubleNode getFirst() {
        return first;
    }

    public void setFirst(DoubleNode first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        DoubleNode node = new DoubleNode(value);
        if (isEmpty()) {
            node.setBack(node);
            node.setNext(node);
        } else {
            node.setBack(first.getBack());
            node.setNext(first);
            node.getNext().setBack(node);
            node.getBack().setNext(node);
        }
        setFirst(node);
    }

    public int removeFirst() {
        int value = first.getValue();
        if (first.getNext() == first) {
            setFirst(null);
        } else {
            first.getNext().setBack(first.getBack());
            first.getBack().setNext(first.getNext());
            setFirst(first.getNext());
        }
        return value;
    }

    // TODO: add insertLast

    public int removeLast() {
        int value = first.getBack().getValue();
        if (first.getNext() == first) {
            setFirst(null);
        } else {
            first.setBack(first.getBack().getBack());
            first.getBack().setNext(first);
        }
        return value;
    }

    @Override
    public String toString() {
        String s = "";

        if (isEmpty()) {
            s += "Empty list.";
        } else {
            DoubleNode aux = first;
            do {
                s += aux.getValue() + " ";
                aux = aux.getNext();
            } while (aux != first);
        }

        return s;
    }
}
