import models.Node;
import models.InheritedDoubleNode;

public class InheritedDoubleNodeApp {
    public static void main(String[] args) {
        Node nodeOne = new Node(2);
        Node nodeTwo = new Node(4);

        InheritedDoubleNode iDoubleNodeOne = new InheritedDoubleNode(3);
        InheritedDoubleNode iDoubleNodeTwo = new InheritedDoubleNode(5);

        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(iDoubleNodeOne);
        iDoubleNodeOne.setNext(iDoubleNodeTwo);

        System.out.println(nodeOne);
        System.out.println(iDoubleNodeOne);
    }
}
