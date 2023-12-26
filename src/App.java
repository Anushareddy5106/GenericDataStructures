public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("LinkedList Using Generics");

        LinkedList myLinkedList1 = new LinkedList();

        myLinkedList1.append(56);
        myLinkedList1.append(30);
        myLinkedList1.append(70);

        LinkedList myLinkedList2 = new LinkedList();

        myLinkedList2.append(56);
        myLinkedList2.append(70);

        Node prevNode = myLinkedList2.head;

        myLinkedList2.insertAfter(prevNode, 30);

        myLinkedList2.display();
    }
}
