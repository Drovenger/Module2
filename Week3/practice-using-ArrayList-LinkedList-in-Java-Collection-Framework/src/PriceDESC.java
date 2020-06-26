import java.util.Comparator;

public class PriceDESC implements Comparator<Product> {
    public int compare(Product s1, Product s2) {
        return s2.getPrice() - s1.getPrice();
    }
}