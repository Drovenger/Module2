import java.util.Comparator;

public class PriceASC implements Comparator<Product> {
    public int compare(Product s1, Product s2) {
        return s1.getPrice() - s2.getPrice();
    }
}