import models.List;

/**
 * NodeApp
 */
public class LinkedListApp {
    public static void main(String[] args) {
        List listOne = new List();

        for (int i = 0; i < 5; i++) {
            listOne.insertFirst(i);
        }

        System.out.println(listOne);

        while (!listOne.isEmpty()) {
            System.out.println(listOne.removeFirst() + " removed.");
            System.out.println(listOne);
        }

        for (int i = 0; i < 5; i++) {
            listOne.insertLast(i);
        }

        System.out.println(listOne);

        while (!listOne.isEmpty()) {
            System.out.println(listOne.removeLast() + " removed.");
            System.out.println(listOne);
        }
    }
}
