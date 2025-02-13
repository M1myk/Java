import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Maka", 9.99, LocalDate.of(2020,10,30)));
        products.add(new Product("Benz", 8.99, LocalDate.of(2020,11,30)));
        products.add(new Product("Benz", 8.99, LocalDate.of(2020,6,30)));
        products.add(new Product("Benz", 8.99, LocalDate.of(2020,7,30)));
        products.add(new Product("Benz", 8.99, LocalDate.of(2020,1,30)));

        Collections.sort(products);

        for (Product product : products)
        {
            System.out.println(product);
        }
    }
}