class Order { // Base class

    // Attributes of this class
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // method to get order status
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {

    int trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println();
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        // Creating objects for DeliveredOrder
        Order order1 = new DeliveredOrder(123, "2025-01-01", 4534, "2025-01-05");
        Order order2 = new DeliveredOrder(124, "2025-01-02", 4535, "2025-01-06");

        // Displaying order statuses
        order1.getOrderStatus();
        order2.getOrderStatus();
    }
}
