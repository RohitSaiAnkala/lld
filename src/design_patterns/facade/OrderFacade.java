package design_patterns.facade;

public class OrderFacade {
    Product product;
    Payment payment;
    Invoice invoice;
    Notification notification;

    OrderFacade() {
        product = new Product();
        payment = new Payment();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void createOrder() {
        Product product1 = product.getProduct();
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
    }
}
