import java.util.ArrayList;
import java.util.List;

public class bank {
    private String name;
    private List<client> clList;
    private List<account> Ac_List;

    public bank(String name) {
        this.name = name;
        this.clList = new ArrayList<client>();
        this.Ac_List = new ArrayList<account>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<client> getClList() {
        return clList;
    }

    public void setClList(List<client> clList) {
        this.clList = clList;
    }

    public List<account> getAcList() {
        return Ac_List;
    }

    public void setAcList(List<account> acList) {
        this.Ac_List = acList;
    }

    public client addClient(person p) {
        client c = new client(p);
        clList.add(c);
        return c;
    }

    public account addAccount(String id, float amount, client c) {
        account a = new account(id, amount, c);
        Ac_List.add(a);
        c.addAccount(a);
        if (!clList.contains(c)) {
            clList.add(c);
        }
        return a;
    }

    public account searchAccount(String id) {
        for (account a : Ac_List) {
            if (a.getNumber().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public Boolean removeClient(String id) {
        client found = null;
        for (client c : clList) {
            if (c.getId().equals(id)) {
                found = c;
                break;
            }
        }
        if (found == null) {
            return false;
        }
        List<account> toRemove = new ArrayList<account>();
        for (account a : Ac_List) {
            if (a.getAcHolder() == found) {
                toRemove.add(a);
            }
        }
        for (account a : toRemove) {
            Ac_List.remove(a);
            found.getAcList().remove(a);
        }
        clList.remove(found);
        return true;
    }

    public float totalAmount() {
        float total = 0;
        for (account a : Ac_List) {
            total = total + a.getAmount();
        }
        return total;
    }

    public client searchCustomerDetail(String cnic) {
        for (client c : clList) {
            if (c.getPersonDetails().getCnic().equals(cnic)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\n" +
                "Total Clients: " + clList.size() + "\n" +
                "Total Accounts: " + Ac_List.size() + "\n" +
                "Bank Total Amount: " + totalAmount();
    }
}
