public class person {
    private String name;
    private String cnic;
    private String ph_No;

    public person(String name, String cnic, String ph_No) {
        this.name = name;
        this.cnic = cnic;
        this.ph_No = ph_No;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPh_No() {
        return ph_No;
    }

    public void setPh_No(String ph_No) {
        this.ph_No = ph_No;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnic='" + cnic + '\'' +
                ", Ph_No='" + ph_No + '\'' +
                '}';
    }
}