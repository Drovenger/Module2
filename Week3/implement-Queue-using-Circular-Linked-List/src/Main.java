public class Main {
    public static void main(String[] args) {
        CircularLinkedList.Queue queue = new CircularLinkedList.Queue();
        queue.front = queue.rear = null;

        CircularLinkedList.enQueue(queue, 14);
        CircularLinkedList.enQueue(queue, 22);
        CircularLinkedList.enQueue(queue, 6);

        CircularLinkedList.displayQueue(queue);

        System.out.print("\nDeleted value = " + CircularLinkedList.deQueue(queue));
        System.out.print("\nDeleted value = " + CircularLinkedList.deQueue(queue)+"\n");

        CircularLinkedList.displayQueue(queue);

        CircularLinkedList.enQueue(queue, 9);
        CircularLinkedList.enQueue(queue, 20);

        System.out.println();
        CircularLinkedList.displayQueue(queue);
    }
}