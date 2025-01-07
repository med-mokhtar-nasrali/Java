import java.util.List;

public class Items {

    // MEMBER VARIABLES
    private String name;
    private double price;
    private List<Items> items;

    // CONSTRUCTOR
    // Takes a name and price as arguments
    // and sets them accordingly
    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS & SETTERS - for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addItem(Items item) {
        this.items.add(item);
    }

}
