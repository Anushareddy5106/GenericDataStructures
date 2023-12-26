public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("LinkedList Using Generics");

        // LinkedList Creation
        LinkedList<String> myLinkedList1 = new LinkedList<>();

        myLinkedList1.add("App");
        myLinkedList1.add("Gogg");
        myLinkedList1.add("Ge");

        // Insertion
        System.out.println("--------------------LinkedList----------------------");
        LinkedList<Integer> myLinkedList2 = new LinkedList<>();

        myLinkedList2.add(56);
        myLinkedList2.add(70);
        myLinkedList2.add(90);
        myLinkedList2.add(45);

        System.out.println("Before Insertion");
        myLinkedList2.display();

        myLinkedList2.insertAfter(5, 30);

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
        Node<Integer> result = myLinkedList2.search(30);
        if (result != null)
            System.out.println("Node found");
        else
            System.out.println("Node not found");

        // Deleting a specified key
        myLinkedList2.delete(70);

        System.out.println("After deleting specified key:");
        myLinkedList2.display();

        // Size
        System.out.println("Size of the LinkedList " + myLinkedList2.size());

        // OrderedLinkedList
        System.out.println("--------------------Ordered LinkedList----------------------");
        OrderedLinkedList<Integer> orderedList = new OrderedLinkedList<>();

        orderedList.add(56);
        orderedList.add(30);
        orderedList.add(40);
        orderedList.add(70);
        orderedList.add(22);

        System.out.println("Ordered Linked List:");
        orderedList.display();

        orderedList.popLast();
        orderedList.display();

        orderedList.delete(40);
        orderedList.display();

        // Indexof
        System.out.println("Index : " + orderedList.indexOf(30));

        // isEmpty
        System.out.println("isEmpty : " + orderedList.isEmpty());

        // Stack
        System.out.println("--------------------Stack----------------------");
        Stack<Integer> stack = new Stack<>();

        stack.push(19);
        stack.push(20);
        stack.push(15);
        stack.push(7);
        stack.push(39);

        System.out.println("Stack :");
        stack.display();

    }
}
