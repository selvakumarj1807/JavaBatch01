class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Copy constructor
    Product(Product other) {
        this.name = other.name;
        this.price = other.price;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

}

public class CopyConstructor04 {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product(product1);

        product1.display();
        product2.display();
    }
}
