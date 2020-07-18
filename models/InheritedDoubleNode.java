package models;

public class InheritedDoubleNode extends Node {
    private InheritedDoubleNode back;

    public InheritedDoubleNode(int value) {
        super(value);
        back = null;
    }

    public InheritedDoubleNode getBack() {
        return back;
    }

    public void setBack(InheritedDoubleNode back) {
        this.back = back;
    }
}
