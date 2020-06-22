public class Node {
    protected Node next;
    protected Object element;

    public Node() {
    }

    public Node(Object element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }
    public Object getElement() {
        return element;
    }

}