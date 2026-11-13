public class Pacman {
    private Position position;
    private int score;
    private boolean alive;

    public Pacman(int row,int col){
        this.position=new Position(row,col);
        this.score=0;
        this.alive=true;

    }
    public Position getposition(){
        return position;
    }
    public int getScore(){
        return score;
    }
    public boolean isAlive(){
        return alive;
    }
    public void die(){
        alive=false;
    }
    public void eat(Food food){
        food.eat();
        score+=10;

    }
    public void move(char direction,GameBoard board){
        int newRow=position.getRow();
        int newCol=position.getCol();

        if(direction == 'W'){
            newRow--;
        }
        else if (direction=='S'){
            newRow++;
        }
        else if (direction=='A'){
            newCol--;
        }
        else if (direction=='D'){
            newCol++;
        }
        if(!board.isWall(newRow,newCol)){
            position.setRow(newRow);
            position.setCol(newCol);
        }

    }

}

