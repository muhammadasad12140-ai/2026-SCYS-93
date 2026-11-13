class Player{
    String name="ASAD";

}
class Coach{
    void train(Player p){
        System.out.println("Coach is training " + p.name);
    }
}

public class task_2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Coach c1 = new Coach();
        c1.train(p1);
    }
}
