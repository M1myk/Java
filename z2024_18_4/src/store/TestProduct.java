package store;



public class TestProduct {
    public static void main(String[] args)
    {
        Product[] products = {
                new Book(),
                new Clothing(),
                new Book(),
                new Clothing(),
                new Book()
        };

        for(Product product : products)
        {
            System.out.println(product.getPrice());
        }
    }
}
