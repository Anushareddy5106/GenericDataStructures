public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("LinkedList Using Generics");

        // LinkedList Creation
        LinkedList myLinkedList1 = new LinkedList();

        myLinkedList1.append(56);
        myLinkedList1.append(30);
        myLinkedList1.append(70);

        // Insertion
        LinkedList myLinkedList2 = new LinkedList();

        myLinkedList2.append(56);
        myLinkedList2.append(70);

        Node prevNode = myLinkedList2.head;
        System.out.println("Before Insertion");
        myLinkedList2.display();

        myLinkedList2.insertAfter(prevNode, 30);

        System.out.println("After Insertion");
        myLinkedList2.display();

        // deletion
        myLinkedList2.pop();

        System.out.println("After Deletion");
        myLinkedList2.display();

    }
}
