class Std{
    void name(){
        System.out.println("Name: ASAD");
        System.out.println("Roll_No: 93");
    }
}
class Tech{
    void teacher(Std s){            //Std s....reference variable
        s.name();
    }
}
public class task_0 {
    public static void main(String[] args) {
        Std s = new Std();
        Tech t = new Tech();
        t.teacher(s);
    }
}
