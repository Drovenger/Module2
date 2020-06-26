import java.util.LinkedList;

public class ProductManagerByLinkedList {

    private LinkedList<Product> list;

    public ProductManagerByLinkedList() {
        list = new LinkedList<Product>();
    }

    public void add(Product product) {
        list.add(product);
    }

    public void edit(int ID, String name, int price) {
        for (Product product : list) {
            if (product.getID() == ID) {
                product.setName(name);
                product.setPrice(price);
                break;
            }
        }
    }

    public void edit(String name, int price) {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                product.setPrice(price);
                break;
            }
        }
    }

    public void delete(Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (product == list.get(i)) {
                list.remove(i);
                break;
            }
        }
    }

    public Product seach(int ID) {
        for (Product product : list) {
            if (product.getID() == ID) {
                return product;
            }
        }
        return null;
    }

    public Product seach(String name) {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void show() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void sortASC() {
        PriceASC asc = new PriceASC();
        list.sort(asc);
    }

    public void sortDESC() {
        PriceDESC desc = new PriceDESC();
        list.sort(desc);
    }
}