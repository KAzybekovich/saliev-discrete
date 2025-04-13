public class Solver {
    private final int endX;
    private final int endY;

    public Solver(int endX, int endY) {
        this.endX = endX;
        this.endY = endY;
    }

    public boolean findPath(char[][] grid, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length)
            return false;

        if (grid[x][y] == '#' || visited[x][y])
            return false;

        if (x == endX && y == endY) {
            grid[x][y] = '.';
            return true;
        }

        visited[x][y] = true;

        if (findPath(grid, x + 1, y, visited) ||
                findPath(grid, x - 1, y, visited) ||
                findPath(grid, x, y + 1, visited) ||
                findPath(grid, x, y - 1, visited)) {
            grid[x][y] = '.';
            return true;
        }

        return false;
    }
}
