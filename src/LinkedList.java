public class LinkedList<T extends Comparable<T>> {
    Node<T> head;

    // Adding the element
    public void add(T data) {
        appendAtTail(data);
    }

    // Append at tail
    public void appendAtTail(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Append at head
    public void appendAtHead(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    // Insertion
    public void insertAfter(int pos, T data) {

        if (pos > this.size()) {
            System.out.println("Invalid Position.");
            return;
        }

        Node<T> newNode = new Node<T>(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> prevNode = head;
        while (pos > 1) {
            prevNode = prevNode.next;
            pos--;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete from front
    public void pop() {
        if (head == null) {
            System.out.println("The linked list is empty. Cannot pop.");
            return;
        }

        head = head.next;
    }

    // Deletion from last
    public void popLast() {
        if (head == null) {
            System.out.println("The linked list is empty. Cannot pop.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
    }

    // Searching
    public Node<T> search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Deleting the node with specific key
    public void delete(T key) {
        Node<T> current = head;
        Node<T> prev = null;

        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found in the linked list.");
            return;
        }

        prev.next = current.next;
    }

    // Size of the LinkedList
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return this.size() == 0 ? true : false;
    }

    // Index
    public int indexOf(T key) {
        Node<T> current = head;
        int pos = 1;
        while (current != null) {
            if (current.data == key) {
                return pos;
            }
            current = current.next;
            pos++;
        }
        return -1;
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
