import java.util.ArrayList;
public class GameBoard {
    private char[][]grid;
    private ArrayList<Food>foods;

    public GameBoard() {
        String[] layout = {
                "###############",
                "#...#....#....#",
                "#.#.#.##.#.##.#",
                "#.#...#....#..#",
                "#.###.#.####.##",
                "#...#.#....#..#",
                "###.#.####.##.#",
                "#.......#...#.#",
                "#.#####.#.#.#.#",
                "#.....#...#...#",
                "#####.###.#####",
                "#...#...#.....#",
                "#.#.###.#####.#",
                "#.............#",
                "###############"
        };

        grid = new char[layout.length][];
        foods = new ArrayList<Food>();

        for (int i = 0; i < layout.length; i++) {
            grid[i] = layout[i].toCharArray();
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '.') {
                    foods.add(new Food(i, j));
                    grid[i][j] = ' ';
                }
            }
        }
    }

    public boolean isWall(int row,int col){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return true;
        }
        return grid[row][col] == '#';
    }

    public Food getFoodAt(Position position){
        for (Food f : foods) {
            if (!f.isEaten() && f.getPosition().equals(position)){
                return f;
            }
        }
        return null;
    }
    public boolean allFoodEaten(){
        for (Food f : foods){
            if (!f.isEaten()){
                return false;
            }
        }
        return true;
    }

    public void display(Pacman pacman, Ghost[] ghosts) {
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Position current = new Position(i, j);
                char symbol = grid[i][j];

                if (getFoodAt(current) != null) {
                    symbol = '.';
                }
                for (Ghost g : ghosts) {
                    if (g.getPosition().equals(current)) {
                        symbol = 'G';
                    }
                }
                if (pacman.getposition().equals(current)) {
                    symbol = 'P';
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}