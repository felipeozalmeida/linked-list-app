import models.DoubleList;

public class DoublyLinkedListApp {
    public static void main(String[] args) {
        DoubleList listOne = new DoubleList();

        // for (int i = 1; i <= 5; i++) {
        //     listOne.insertFirst(i);
        // }

        // System.out.println(listOne);

        // while (!listOne.isEmpty()) {
        //     System.out.println(listOne.removeFirst() + " removed.");
        //     System.out.println(listOne);
        //     System.out.println(listOne.getFirst());
        // }

        for (int i = 1; i <= 5; i++) {
            listOne.insertLast(i);
        }

        System.out.println(listOne);

        while (!listOne.isEmpty()) {
            System.out.println(listOne.removeLast() + " removed.");
            System.out.println(listOne);
            System.out.println(listOne.getFirst());
        }
    }
}
