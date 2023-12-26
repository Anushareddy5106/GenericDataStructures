public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("LinkedList Using Generics");

        LinkedList myLinkedList = new LinkedList();

        myLinkedList.append(56);
        myLinkedList.append(30);
        myLinkedList.append(70);

        myLinkedList.display();
    }
}
