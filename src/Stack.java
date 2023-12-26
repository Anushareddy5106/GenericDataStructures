public class Stack<T extends Comparable<T>> {

    LinkedList<T> list;

    Stack() {
        this.list = new LinkedList<>();
    }

    // Push
    public void push(T data) {
        list.appendAtHead(data);
    }

    // Display the elements
    public void display() {
        Node<T> current = list.head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
