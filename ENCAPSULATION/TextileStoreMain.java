package ENCAPSULATION.TASK3;

class Product {
    private String productName;
    private int productId;
    private double price;
    private int quantity;

    public Product(String productName, int productId, double price, int quantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price);
        setQuantity(quantity);
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Error: Price must be non-negative.");
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Error: Quantity must be non-negative.");
        } else {
            this.quantity = quantity;
        }
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class TextileStore {
    private Product[] products;
    private int productCount;

    public TextileStore(int storeSize) {
        products = new Product[storeSize];
        productCount = 0;
    }

    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Store is full, cannot add more products.");
        }
    }

    public void displayAllProducts() {
        for (int i = 0; i < productCount; i++) {
            products[i].displayProductDetails();
            System.out.println("-----------------------------");
        }
    }
}

public class TextileStoreMain {
    public static void main(String[] args) {
        Product product1 = new Product("Cotton Fabric", 101, 250.50, 100);
        Product product2 = new Product("Silk Fabric", 102, 500.75, 50);

        TextileStore store = new TextileStore(5);
        store.addProduct(product1);
        store.addProduct(product2);

        store.displayAllProducts();
    }
}
