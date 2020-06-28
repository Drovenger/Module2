public class CircularLinkedList {
    public static class Node {
        public int data;
        public Node next;
    }

    public static class Queue {
        public Node front;
        public Node rear;
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.next = temp;
        }
        q.rear = temp;
        q.rear.next = q.front;
    }

    public static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.next;
            q.rear.next = q.front;
        }
        return value;
    }

    public static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are: ");
        while (temp.next != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.data);
    }
}