class CONSTRUCTER{
    private String Name;

    public String getName() {
        return Name;
    }

    public String getReg_no() {
        return Reg_no;
    }

    private String Reg_no;

    public CONSTRUCTER(String name, String reg_no) {
        this.Name = name;
        this.Reg_no = reg_no;


    }
    void n(){
        System.out.println("Name: "+Name);
        System.out.println("Reg No: "+Reg_no);

    }
}

public class Task1{
    public static void main(String[] args) {
        CONSTRUCTER s=new CONSTRUCTER("MUHAMMAD ASAD", "2026(S)-CYS-93");
        System.out.println("Name: "+s.getName());
        System.out.println("Reg No: "+s.getReg_no());
    }
}
