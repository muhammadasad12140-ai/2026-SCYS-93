import java.util.Random;
public class Ghost {
    private Position position;
    private Random random;

    public Ghost(int row,int col){
        this.position=new Position(row,col);
        this.random=new Random();

    }
    public Position getPosition() {
        return position;
    }

    public void moveRandom(GameBoard board){
        int newRow=position.getRow();
        int newCol=position.getCol();
        int d=random.nextInt(4);

        if(d==0){
            newRow--;}
        else if (d==1) {
            newRow++;
        }
        else if(d==2){
            newCol--;
        }
        else{
            newCol++;
        }

        if(!board.isWall(newRow,newCol)){
            position.setRow(newRow);
            position.setCol(newCol);
        }

    }

}
