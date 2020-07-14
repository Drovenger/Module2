import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        ProductIO.readProduct("product.txt");
        //productManagement.createList();
        System.out.println("MENU:");
        System.out.println("0. Print the current list");
        System.out.println("1. Add a product");
        System.out.println("2. Write to file");
        System.out.println("3. Read from file");
        System.out.println("4. Find by ID");
        System.out.println("5. Remove by ID");
        System.out.println("6. Replace by ID");
        System.out.println("7. Sorting by price ascending");
        System.out.println("8. Sorting by price descending");
        System.out.println("What you want to do?");
        int choice = scanner.nextInt();
        try {
            while (choice >= 0 && choice <= 8) {
                switch (choice) {
                    case 0:
                        productManagement.displayProduct();
                        break;
                    case 1:
                        productManagement.addProduct();
                        System.out.println("After adding:");
                        productManagement.displayProduct();
                        break;
                    case 2:
                        ProductIO.writeProduct(productManagement.productsList, "product.txt");
                        break;
                    case 3:
                        ProductIO.readProduct("product.txt");
                        break;
                    case 4:
                        productManagement.findByID();
                        break;
                    case 5:
                        productManagement.removeID();
                        System.out.println("After removing: ");
                        productManagement.displayProduct();
                        break;
                    case 6:
                        productManagement.replaceID();
                        break;
                    case 7:
                        productManagement.productsList.sort(Comparator.comparingInt(Product::getPrice));
                        System.out.println("After sorting: ");
                        productManagement.displayProduct();
                        break;
                    case 8:
                        Collections.sort(productManagement.productsList);
                        System.out.println("After sorting: ");
                        productManagement.displayProduct();
                        break;

                    default:
                        System.exit(0);
                }
                System.out.println();
                System.out.println("What you want to do next?");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            }
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}