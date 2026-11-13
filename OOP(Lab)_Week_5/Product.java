
import java.util.Scanner;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private static int totalProduct = 0;

    public Product() {
        counter();
    }

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        counter();
    }

    public void getData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        name = s.next();
        System.out.print("Price: ");
        price = s.nextInt();
        System.out.print("Quantity: ");
        quantity = s.nextInt();

    }


    public static void counter() {
        totalProduct++;
    }

    public static int countProduct() {
        return totalProduct;
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Glitter Pens", 300, 1);
        p2.getData();

        new Product();

        System.out.println("Total Products: " + Product.countProduct());
    }
}
