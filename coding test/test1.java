
import java.util.LinkedList;
import java.util.Queue;

public class test1 {

    static class Cell {
        int row, col, time;
        public Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int minTimeToEatCheese(int[][] grid) {
        int n = grid.length;
        int ratCount = 1; // Initial rat count
        // Find the initial position of the rat
        int startRow = 0, startCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    startRow = i;
                    startCol = j;
                } else if (grid[i][j] == 1) {
                    ratCount++; // Count the number of cheese
                }
            }
        }

        // If there is no cheese, no need to move
        if (ratCount == 1) {
            return 0;
        }

        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        // Add the initial position of the rat to the queue
        queue.offer(new Cell(startRow, startCol, 0));
        visited[startRow][startCol] = true;

        int[] rowDir = {-1, 0, 1, 0};
        int[] colDir = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newRow = currentCell.row + rowDir[i];
                int newCol = currentCell.col + colDir[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    if (grid[newRow][newCol] == 1) {
                        ratCount--;
                        if (ratCount == 1) {
                            return currentCell.time + 1; // All cheese eaten
                        }
                    }

                    queue.offer(new Cell(newRow, newCol, currentCell.time + 1));
                    visited[newRow][newCol] = true;
                }
            }
        }

        return -1; // It is not possible to eat all cheese
    }

    public static void main(String[] args) {
        // Example Usage
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        int result = minTimeToEatCheese(grid);
        System.out.println("Minimum time required to eat all cheese: " + result);
    }
}

