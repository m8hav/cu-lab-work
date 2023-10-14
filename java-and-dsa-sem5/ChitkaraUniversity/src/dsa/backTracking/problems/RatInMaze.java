package dsa.backTracking.problems;

/*
    Given a maze of m rows and n columns.
    Each cell has value 0 or 1.
    0 represents the cell is open.
    1 represents the cell is blocked.

    We're a rat and standing at the starting position of the maze i.e. first row and first column.

    The destination is the very last cell i.e. last row and last column of the maze.

    Goal is to print all paths from the starting position to the destination.
    Paths indicate the following steps:
        R - Right
        D - Down
        L - Left
        T - Top

 */

public class RatInMaze {
    private final int rows;
    private final int cols;
    private final byte[][] maze;
    private int solutionCount;
    private final boolean[][] cellVisitedMaze;

    public void setBooleanMaze() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                cellVisitedMaze[i][j] = (maze[i][j] != 0);
    }

    public RatInMaze(byte[][] maze) {
        this.maze = maze;
        this.rows = maze.length;
        this.cols = maze[0].length;
        this.cellVisitedMaze = new boolean[rows][cols];
        this.setBooleanMaze();
        this.solutionCount = 0;
    }

    public void findPaths(int row, int col, String solution) {
        // returning if we're out of bounds
        // or on a cell that was already visited
        // or on a blocked cell
        if (row < 0 || col < 0 || row == rows || col == cols ||
                cellVisitedMaze[row][col] ||
                maze[row][col] == 1)
            return;

        // printing solution and returning from this recursive call if we've reached the last cell
        if (row == rows - 1 && col == cols - 1) {
            System.out.println(++solutionCount + ": " + solution);
            return;
        }

        // marking cell as visited for further recursive paths
        cellVisitedMaze[row][col] = true;

        // adding separators to solution string after certain lengths to keep it clear
        if ((solution.length() > 0 && solution.length() < 5 && solution.length() % 3 == 0) || (solution.length() > 5 && (solution.length() + 1) % 4 == 0)) solution += "-";

        // making 4 recursive calls to all 4 directions
        findPaths(row, col + 1, solution + "R");
        findPaths(row + 1, col, solution + "D");
        findPaths(row, col - 1, solution + "L");
        findPaths(row - 1, col, solution + "T");

        // marking cell as not visited for recursive paths before this call
        cellVisitedMaze[row][col] = false;
    }

    public void findPaths() {
        System.out.println("Paths:");
        findPaths(0, 0, "");
        System.out.println(solutionCount + " total paths.");
    }

    public static void main(String[] args) {
        byte[][] maze1 = {
                {0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 0}
        };
        byte[][] maze2 = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        RatInMaze obj = new RatInMaze(maze1);
        obj.findPaths();
    }
}
