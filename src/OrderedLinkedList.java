public class OrderedLinkedList<T extends Comparable<T>> extends LinkedList<T> {

    // Add in sorted way
    @Override
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null || head.compareTo(newNode) > 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;

            while (current.next != null && current.next.compareTo(newNode) < 0) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Display
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
