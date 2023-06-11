package design_patterns.facade;

public class Product {
    public Product getProduct() {
        // dummy implementation
        System.out.println("Product fetched");
        return new Product();
    }
}
