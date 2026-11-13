import java.util.ArrayList;
import java.util.List;

public class client {
    private static int count = 0;
    private String id;
    private person personDetails;
    private List<account> Ac_List;

    public client(person personDetails) {
        count++;
        this.id = String.valueOf(count);
        this.personDetails = personDetails;
        this.Ac_List = new ArrayList<account>();
    }

    public static int getCount() {
        return count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public person getPersonDetails() {
        return personDetails;
    }

    public void setPersonDetails(person personDetails) {
        this.personDetails = personDetails;
    }

    public List<account> getAcList() {
        return Ac_List;
    }

    public void setAcList(List<account> ac_List) {
        this.Ac_List = ac_List;
    }

    public void addAccount(account a) {
        Ac_List.add(a);
    }

    public float totalAmount() {
        float total = 0;
        for (account a : Ac_List) {
            total = total + a.getAmount();
        }
        return total;
    }

    public void withdraw(float amount, String accNo) {
        for (account a : Ac_List) {
            if (a.getNumber().equals(accNo)) {
                float remaining = a.withdraw(amount);
                System.out.println("Remaining Balance: " + remaining);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void deposit(float amount, String accNo) {
        for (account a : Ac_List) {
            if (a.getNumber().equals(accNo)) {
                float newAmount = a.deposit(amount);
                System.out.println("Current Balance: " + newAmount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    @Override
    public String toString() {
        String s = "Client ID: " + id + "\n" +
                "Name: " + personDetails.getName() + "\n" +
                "CNIC: " + personDetails.getCnic() + "\n" +
                "Phone: " + personDetails.getPh_No() + "\n" +
                "Accounts Details:\n";
        for (account a : Ac_List) {
            s = s + "Account ID: " + a.getNumber() + "\n" +
                    "Amount: " + a.getAmount() + "\n";
        }
        return s;
    }
}
