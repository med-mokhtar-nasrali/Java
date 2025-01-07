public class TestOrders {
    public static void main(String[] args) {
        // Create three orders with specified names
        Orders order1 = new Orders("Guest");
        Orders order2 = new Orders("Guest");
        Orders order3 = new Orders("Guest");

        // Add items to the orders
        Items item1 = new Items("Coffee", 2.50);
        Items item2 = new Items("Donut", 1.50);
        Items item3 = new Items("Latte", 3.50);
        Items item4 = new Items("Cappuciono", 2.50);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item1);
        order2.addItem(item3);

        order3.addItem(item2);
        order3.addItem(item4);

        // Set some orders to ready
        order1.setReady(true);
        order2.setReady(false);
        order3.setReady(true);

        System.out.println("-------------------------------");

        // Print status messages for each order
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());

        System.out.println("-------------------------------");

        // Print the total for each order
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());
        System.out.println("Order 2 Total: $" + order2.getOrderTotal());
        System.out.println("Order 3 Total: $" + order3.getOrderTotal());

        System.out.println("-------------------------------");

        // Display the orders
        System.out.println(order1.display());
        System.out.println(order2.display());
        System.out.println(order3.display());
    }
}