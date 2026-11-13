import java.util.Scanner;

public class Walls {
    private String flavor;
    private int scoops;
    private String coneType;
    private double price;

    public Walls() {
        this.flavor = "Vanilla";
        this.scoops = 1;
        this.coneType = "Sugar";
        calculatePrice();
    }

    public Walls(String flavor, int scoops, String coneType) {
        this.flavor = flavor;
        this.scoops = scoops;
        this.coneType = coneType;
        calculatePrice();
    }

    private void calculatePrice() {
        price = scoops * 75;
        if (coneType.equals("Waffle")) {
            price += 40;
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public int getScoops() {
        return scoops;
    }

    public String getConeType() {
        return coneType;
    }

    public double getPrice() {
        return price;
    }

    public void printOrder() {
        System.out.println("Ur order has following specs:");
        System.out.println("Flavor " + flavor);
        System.out.println("Scoops " + scoops);
        System.out.println("Cone " + coneType);
        System.out.println("Total Price: Rs." + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Flavors menu: chocolate, vanilla, strawberry, mango, tutti, almond, coffee");
        System.out.print("Enter flavor: ");
        String flavor = sc.nextLine();
        System.out.print("Enter scoops (1-5): ");
        int scoops = sc.nextInt();
        sc.nextLine();
        System.out.print("Cone type (Sugar/Waffle): ");
        String cone = sc.nextLine();

        Walls order = new Walls(flavor, scoops, cone);
        order.printOrder();
    }
}
