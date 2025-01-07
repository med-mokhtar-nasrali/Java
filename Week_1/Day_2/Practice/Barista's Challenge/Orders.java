import java.util.ArrayList;
import java.util.List;

public class Orders {
    // MEMBER VARIABLES
    private String name;
    private List<Items> items;
    private boolean ready;

    // CONSTRUCTOR
    public Orders() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }

    // Overloaded constructor to accept a name
    public Orders(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // ADD ITEM METHOD
    public void addItem(Items item) {
        this.items.add(item);
    }

    // GET ORDER TOTAL METHOD
    public double getOrderTotal() {
        double total = 0;
        for (Items item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // DISPLAY METHOD
    public String display() {
        String output = "";
        output += "Customer Name: " + this.name + "\n";
        output += "Items Ordered: \n";
        for (Items item : items) {
            output += item.getName() + " - $" + item.getPrice() + "\n";
        }
        output += "Total: $" + this.getOrderTotal() + "\n";
        return output;
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}