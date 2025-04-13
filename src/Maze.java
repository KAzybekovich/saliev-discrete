import java.util.*;

public class Maze {
    private final int rows, cols;
    private final char[][] grid;
    private final Random rand = new Random();

    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.grid = new char[rows][cols];
    }

    public void generate() {
        // Заполнение стенами
        for (int i = 0; i < rows; i++)
            Arrays.fill(grid[i], '#');

        // Стартовая точка
        generateMaze(1, 1);

        // Установка точки входа и выхода
        grid[0][0] = ' ';
        grid[rows - 1][cols - 1] = ' ';
    }

    private void generateMaze(int x, int y) {
        int[] dx = {0, 0, -2, 2};
        int[] dy = {-2, 2, 0, 0};
        List<Integer> dirs = Arrays.asList(0, 1, 2, 3);
        Collections.shuffle(dirs);

        grid[x][y] = ' ';

        for (int dir : dirs) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx > 0 && ny > 0 && nx < rows - 1 && ny < cols - 1 && grid[nx][ny] == '#') {
                grid[x + dx[dir] / 2][y + dy[dir] / 2] = ' ';
                generateMaze(nx, ny);
            }
        }
    }

    public char[][] getGrid() {
        return grid;
    }
}
