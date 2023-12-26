public class OrderedLinkedList extends LinkedList {

    // Add in sorted way
    @Override
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null || head.compareTo(newNode) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null && current.next.compareTo(newNode) < 0) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Display
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
