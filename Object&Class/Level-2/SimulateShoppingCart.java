import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    List<CartItem> cart = new ArrayList<>();

    void addItem(String name, double price, int qty) {
        cart.add(new CartItem(name, price, qty));
    }

    void removeItem(String name) {
        cart.removeIf(item -> item.itemName.equals(name));
    }

    double totalCost() {
        double total = 0;
        for (CartItem item : cart)
            total += item.price * item.quantity;
        return total;
    }

    void displayCart() {
        for (CartItem item : cart)
            System.out.println(item.itemName + " x" + item.quantity + " : " + item.price);
        System.out.println("Total: " + totalCost());
    }

    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("Book", 120, 2);
        sc.addItem("Pen", 10, 5);
        sc.displayCart();
        sc.removeItem("Pen");
        sc.displayCart();
    }
}
