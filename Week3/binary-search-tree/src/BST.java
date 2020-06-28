public class BST<E> {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        postOrder(node.left);
        postOrder(node.right);
    }

    public void preOrder() {
        preOrder(root);
    }

    public void moveNode(Node<E> parent, Node<E> child) {
        if (child != null) {
            Node<E> current = parent;
            while (true) {
                if (current.compareTo(child.getElement()) > 0) {
                    if (current.getLeft() == null) {
                        current.setLeft(child);
                        break;
                    }
                    current = current.getLeft();
                } else {
                    if (current.getRight() == null) {
                        current.setRight(child);
                        break;
                    }
                    current = current.getRight();
                }
            }
        }
    }

    public boolean delete(E key) {
        boolean isDelete = false;
        Node<E> current = root;
        while (current != null) {
            if (current.compareTo(key) > 0) {
                current = current.getLeft();
            } else if (current.compareTo(key) < 0) {
                current = current.getRight();
            } else {
                isDelete = true;
                // current
                Node<E> leftCurrent = current.getLeft();
                Node<E> rightCurrent = current.getRight();
                //
                if (current.getParent() == null) {
                    root = null;
                    if (leftCurrent != null) {
                        root = leftCurrent;
                        moveNode(root, rightCurrent);
                    } else if (rightCurrent != null) {
                        root = rightCurrent;
                    }
                } else {
                    current.setLeft(null);
                    current.setRight(null);

                    if (current.getParent().compareTo(current.getElement()) > 0) {
                        current.getParent().setLeft(null);
                    } else {
                        current.getParent().setRight(null);
                    }

                    moveNode(current.getParent(), leftCurrent);
                    moveNode(current.getParent(), rightCurrent);
                }
                break;
            }
        }
        return isDelete;
    }
}