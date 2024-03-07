package array.sorting;

public class test2 {

    static class Cell {
        int row, col, time;

        public Cell(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int minTimeToEatCheese(int[][] grid) {
        int n = grid.length, ratCount = 1, startRow = 0, startCol = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) startRow = i;
                else if (grid[i][j] == 1) ratCount++;
            }

        if (ratCount == 1) return 0;

        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        int[] rowDir = {-1, 0, 1, 0}, colDir = {0, 1, 0, -1};

        queue.offer(new Cell(startRow, startCol, 0));
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            Cell currentCell = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newRow = currentCell.row + rowDir[i], newCol = currentCell.col + colDir[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    if (grid[newRow][newCol] == 1 && --ratCount == 1)
                        return currentCell.time + 1;

                    queue.offer(new Cell(newRow, newCol, currentCell.time + 1));
                    visited[newRow][newCol] = true;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0},
                {1, 2, 1},
                {0, 1, 0}
        };

        int result = minTimeToEatCheese(grid);
        System.out.println("Minimum time required to eat all cheese: " + result);
    }
}


