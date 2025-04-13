import java.util.Scanner;

public class MazeSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размеров лабиринта
        System.out.print("Введите количество строк (нечетное, минимум 11): ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов (нечетное, минимум 11): ");
        int cols = scanner.nextInt();

        // Проверка валидности
        if (rows < 11 || cols < 11 || rows % 2 == 0 || cols % 2 == 0) {
            System.out.println("Размеры должны быть нечетными и не меньше 11.");
            return;
        }

        // Создание лабиринта и генерация
        Maze maze = new Maze(rows, cols);
        maze.generate();
        char[][] grid = maze.getGrid();

        // Старт и финиш
        int startX = 1, startY = 1;
        int endX = rows - 2, endY = cols - 2;
        grid[startX][startY] = ' ';
        grid[endX][endY] = ' ';

        // Поиск пути
        boolean[][] visited = new boolean[rows][cols];
        Solver solver = new Solver(endX, endY);  // передаём выход
        boolean found = solver.findPath(grid, startX, startY, visited);

        // Отображение
        System.out.println("Сгенерированный лабиринт:");
        Utils.printMaze(grid);

        if (found) {
            System.out.println("\nПуть найден:");
            Utils.printMaze(grid);
        } else {
            System.out.println("\nПуть не найден.");
        }
    }
}
