import java.util.ArrayList;

public class AddRemove {
    public static void main(String[] args) {
        BST bst1 = new BST();
        bst1.root = new Node(10);
        bst1.root.left = new Node(20);
        bst1.root.right = new Node(30);
        bst1.root.left.left = new Node(40);
        bst1.root.left.right = new Node(50);
        //Before deleting
        System.out.print("Before deleting: \n");
        bst1.postOrder();
        bst1.delete(10);
        System.out.print("\nAfter deleting: \n");
        bst1.postOrder();
    }
}