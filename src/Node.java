public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public int compareTo(Node<T> node) {
        return this.data.compareTo(node.data);
    }
}
