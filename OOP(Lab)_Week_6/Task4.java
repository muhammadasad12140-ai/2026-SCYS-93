class Order{
    int orderNo=104;
}
class Customer{
    String name="ASAD";
    void placeOrder(Order order){
        System.out.println("Customer " + name + " placed order number: " + order.orderNo);
    }
}
public class task_3 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Order o1 = new Order();
        c1.placeOrder(o1);
    }
}
