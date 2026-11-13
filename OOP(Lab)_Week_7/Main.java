public class Main {
    public static void main(String[] args) {
        bank b = new bank("National Bank");

        person p1 = new person("Ali", "12345-1234567-1", "03001234567");
        person p2 = new person("Hasan", "54321-7654321-2", "03111234567");

        client c1 = b.addClient(p1);
        client c2 = b.addClient(p2);

        b.addAccount("1001", 5000, c1);
        b.addAccount("1002", 3000, c1);
        b.addAccount("1003", 7000, c2);

        System.out.println("===== BANK DETAILS =====");
        System.out.println();
        System.out.println(b);
        System.out.println();

        System.out.println("===== CLIENT DETAILS =====");
        System.out.println();
        System.out.println(c1);

        System.out.println("===== ACCOUNT DETAILS =====");
        System.out.println();
        for (account a : c1.getAcList()) {
            System.out.println(a);
            System.out.println();
        }

        System.out.println("===== DEPOSIT =====");
        c1.deposit(1000, "1001");
        System.out.println();

        System.out.println("===== WITHDRAW =====");
        c1.withdraw(500, "1002");
        System.out.println();

        System.out.println("Client Total Amount: " + c1.totalAmount());
        System.out.println();

        System.out.println("===== SEARCH ACCOUNT =====");
        System.out.println();
        account found = b.searchAccount("1001");
        System.out.println(found);
        System.out.println();

        System.out.println("===== SEARCH CUSTOMER =====");
        System.out.println();
        client searched = b.searchCustomerDetail("12345-1234567-1");
        System.out.println(searched);

        System.out.println("Bank Total Amount: " + b.totalAmount());
        System.out.println();

        System.out.println("===== REMOVE CLIENT =====");
        System.out.println("Client Removed: " + b.removeClient(c2.getId()));
        System.out.println();

        System.out.println("===== FINAL BANK DETAILS =====");
        System.out.println();
        System.out.println(b);
    }
}
