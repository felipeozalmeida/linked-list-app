package models;

public class DoubleNode {
    private int value;
    private DoubleNode back;
    private DoubleNode next;

    public DoubleNode(int value) {
        this.value = value;
        back = null;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getBack() {
        return back;
    }

    public void setBack(DoubleNode back) {
        this.back = back;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
