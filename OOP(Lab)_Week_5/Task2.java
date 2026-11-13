
class asad{
    private String name;
    private String reg_no;

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    void n(){
        System.out.println("name: "+name);
        System.out.println("Reg No: "+reg_no);

    }
}

public class Task2{
    public static void main(String[] args) {
        asad s=new asad();
        s.setName("MUHAMMAD ASAD");
        s.setReg_no("2026(S)-CYS-93");
        System.out.println("Name: "+s.getName());
        System.out.println("Reg No: "+s.getReg_no());
    }
}
