public class account {
    private static int count = 0;
    private String number;
    private float amount;
    private client Ac_Holder;

    public account(String number, float amount, client ac_Holder) {
        this.number = number;
        this.amount = amount;
        this.Ac_Holder = ac_Holder;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public client getAcHolder() {
        return Ac_Holder;
    }

    public void setAcHolder(client ac_Holder) {
        this.Ac_Holder = ac_Holder;
    }

    public float withdraw(float amt) {
        if (amt > amount) {
            System.out.println("Not enough balance in account " + number);
        } else {
            amount = amount - amt;
        }
        return amount;
    }

    public float deposit(float amt) {
        amount = amount + amt;
        return amount;
    }

    @Override
    public String toString() {
        return "Account Number: " + number + "\n" +
                "Balance: " + amount + "\n" +
                "Account Holder: " + Ac_Holder.getPersonDetails().getName();
    }
}
