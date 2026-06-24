import java.util.HashMap;

class Product {
    int productId;
    String productName;

    Product(int id, String name) {
        productId = id;
        productName = name;
    }
}

public class InventoryManagementSystem {

    public static void main(String[] args) {

        HashMap<Integer, Product> inventory =
                new HashMap<>();

        inventory.put(1, new Product(1, "Laptop"));
        inventory.put(2, new Product(2, "Mouse"));

        System.out.println("Products Added");

        inventory.remove(2);

        System.out.println("Product Deleted");
    }
          }
