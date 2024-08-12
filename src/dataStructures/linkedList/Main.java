package dataStructures.linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(4);

        myLinkedList.printList();
        System.out.println(myLinkedList.removeLast().value);
        myLinkedList.printList();

        myLinkedList.prepend(3);

        myLinkedList.printList();

        System.out.println(myLinkedList.removeFirst().value);

        myLinkedList.printList();

        System.out.println(myLinkedList.get(1).value);

        myLinkedList.printList();

        System.out.println(myLinkedList.set(1, 3));

        myLinkedList.printList();
    }
}
