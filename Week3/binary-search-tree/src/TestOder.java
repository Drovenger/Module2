class TestOrder {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(10);
        bst.root.left = new Node(20);
        bst.root.right = new Node(30);
        bst.root.left.left = new Node(40);
        bst.root.left.right = new Node(50);

        bst.postOrder();
        System.out.print("\n");
        bst.preOrder();
    }
}