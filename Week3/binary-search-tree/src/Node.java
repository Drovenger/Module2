public class Node<E> {
    public E key;
    public Node<E> left;
    public Node<E> right;
    private Node<E> parent;

    public Node(E key) {
        this.key = key;
    }

    // Get
    public Node<E> getParent() {
        return parent;
    }

    public Node<E> getLeft() {
        return left;
    }

    public Node<E> getRight() {
        return right;
    }

    // Set
    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public void setLeft(Node<E> left) {
        if (left != null) left.setParent(this);
        this.left = left;
    }

    public void setRight(Node<E> right) {
        if (right != null) right.setParent(this);
        this.right = right;
    }

    public E getElement() {
        return key;
    }

    public int compareTo(E o) {
        Comparable o1 = (Comparable) this.key;
        Comparable o2 = (Comparable) o;

        if (o1.compareTo(o2) > 0)
            return 1;
        else if (o1.compareTo(o2) < 0)
            return -1;
        else
            return 0;
    }
}