import java.util.Scanner;

public class PacmanGame {
    private GameBoard board;
    private Pacman pacman;
    private Ghost[] ghosts;
    Scanner input;

    public PacmanGame(Pacman pacman, Ghost[] ghosts){
        this.pacman = pacman;
        this.ghosts = ghosts;
        this.board=new GameBoard();
        this.input=new Scanner(System.in);
    }
    private char handleInput() {
        System.out.print("Enter move: ");
        String line = input.nextLine().trim().toUpperCase();

        if (line.length() == 0){
            return ' ';
        }
        char key=line.charAt(0);
        if(key=='W' || key=='A' || key=='S' || key=='D' || key=='Q') {
            return key;
        }
        return ' ';
    }
    private void checkCollision(){
        for (Ghost g:ghosts){
            if(g.getPosition().equals(pacman.getposition())){
                pacman.die();
            }
        }
    }
    private boolean checkWin(){
        return board.allFoodEaten();
    }
    private void endGame(String message){
        board.display(pacman,ghosts);
        System.out.println(message);
        System.out.println("Final Score: "+pacman.getScore());
    }
    public void gameLoop() {
        System.out.println("===== PACMAN GAME =====");
        System.out.println("Eat all the dots and avoid the ghosts.");
        System.out.println("Controls: W = up, S = down, A = left, D = right, Q = quit");

        while (true){
            board.display(pacman,ghosts);
            System.out.println("Score: "+pacman.getScore());

            char key =handleInput();
            if(key=='Q'){
                endGame("u quit the game.");
                return;
            }
            if(key==' '){
                System.out.println("invalid key, Use W, A,S or D");
                continue;
            }
            pacman.move(key,board);
            Food food=board.getFoodAt(pacman.getposition());
            if(food!=null){
                pacman.eat(food);
            }
            checkCollision();
            if(!pacman.isAlive()){
                endGame("Ghost caught u. Game Over!!!");
                return;
            }
            if(checkWin()){
                endGame("u ate all dots. You Win!!!\uD83E\uDD73");
                return;
            }
            for(Ghost g:ghosts){
                g.moveRandom(board);
            }
            checkCollision();
            if(!pacman.isAlive()){
                endGame("A ghost caught u. Game Over!!!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Pacman pacman=new Pacman(1,1);
        Ghost[] ghosts={new Ghost(13,13),new Ghost(7,7)};
        PacmanGame game=new PacmanGame(pacman,ghosts);
        game.gameLoop();

    }
}
