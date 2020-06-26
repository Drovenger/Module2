public class TestLinkedList {
    public static void main(String[] args) {
        ProductManagerByLinkedList managerByArrayList = new ProductManagerByLinkedList();

        // Add product
        Product productBook  = new Product(122, "Book",  100000);
        Product productGame  = new Product(123, "Game",  700000);
        Product productTable = new Product(125, "Table", 170000);

        managerByArrayList.add(productBook);
        managerByArrayList.add(productGame);
        managerByArrayList.add(productTable);

        System.out.println("Not arranged:");
        managerByArrayList.show();
        System.out.println("\nDescending by price:");
        managerByArrayList.sortDESC();
        managerByArrayList.show();

        System.out.println("\nDelete:");

        managerByArrayList.delete(productTable);

        managerByArrayList.show();

        System.out.println("\nSeach product \"Game\":");
        System.out.println(managerByArrayList.seach("Game"));
    }
}