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
        myLinkedList2.append(90);
        myLinkedList2.append(45);

        Node prevNode = myLinkedList2.head;
        System.out.println("Before Insertion");
        myLinkedList2.display();

        myLinkedList2.insertAfter(prevNode, 30);

        System.out.println("After Insertion");
        myLinkedList2.display();

        // deletion from front
        myLinkedList2.pop();

        System.out.println("After Deletion from front");
        myLinkedList2.display();

        // deletion from last
        myLinkedList2.popLast();

        System.out.println("After Deletion from last:");
        myLinkedList2.display();

        // Searching
        Node result = myLinkedList2.search(30);
        if (result != null)
            System.out.println("Node found");
        else
            System.out.println("Node not found");

        // Deleting a specified key
        myLinkedList2.delete(70);

        System.out.println("After deleting specified key:");
        myLinkedList2.display();
    }
}
