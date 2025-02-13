import java.time.LocalDate;

public class Product implements Comparable<Product>{
    private String name;
    private double price;
    private LocalDate productionDate;
    public Product(String name, double price, LocalDate productionDate)
    {
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.productionDate.getMonthValue(), o.productionDate.getMonthValue());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                '}';
    }
}
