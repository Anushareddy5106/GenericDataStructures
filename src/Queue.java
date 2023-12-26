public class Queue<T extends Comparable<T>> {

    LinkedList<T> list;

    Queue() {
        this.list = new LinkedList<>();
    }

    // enqueue
    public void enqueue(T data) {
        list.appendAtTail(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }

        T poppedData = list.head.data;
        list.head = list.head.next;
        return poppedData;
    }

    // dequeue
    public T front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.No peek element");
        }

        return list.head.data;
    }

    public boolean isEmpty() {
        return list.head == null;
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
