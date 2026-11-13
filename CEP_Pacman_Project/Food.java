public class Food
{
    private Position position;
    private boolean eaten;

    public Food(int row,int col){
        this.position =new Position(row,col);
        this.eaten = false;


    }
    public Position getPosition(){
        return position;
    }
    public boolean isEaten(){
        return eaten;
    }
    public void eat(){
        eaten =true;

    }

}
