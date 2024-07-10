
class Product {
    // Private properties to hold the product name and price
    private String name;
    private double price;

    // Constructor to initialize the product name and price
    public Product(String name, double price) {
        this.name = name;
        setPrice(price); // Use the setPrice method to ensure the price is valid
    }

    // Method to get the produc name
    public String getName() {
        return name;
    }

    // Method to set the product name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the product price
    public double getPrice() {
        return price;
    }

    // Method to set the product price
    public void setPrice(double price) {
        //  price is positive
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive.");
        }
    }

    public static void main(String[] args) {
        // Create a new instance of Product9
        Product product = new Product("Laptop Dell", 199999.39);

        // Print the product name
        System.out.println("Product Name: " + product.getName());

        // Print the product price
        System.out.println("Product Price: " + product.getPrice());

        // Set a new name for the product
        product.setName(" Sony Xperia");

        // Set a new price for the product
        product.setPrice(50000.60);

        // Print the updated product name
        System.out.println("Updated Product Name: " + product.getName());

        // Print the updated product price
        System.out.println("Updated Product Price: " + product.getPrice());


    }
}
