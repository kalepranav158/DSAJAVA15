package Recursion;

public class bcktrk {
    public static void main(String[] args) {
        boolean [][] maze = {{true,true,true},
                {true,true,true},
                {true,true,true},
        };
        System.out.println("Maze Game");
        path("",maze,0,0);
    }

    static void path(String ans, boolean[][] maze, int row, int column) {
        // Base case: Out of bounds
        if (row >= maze.length || column >= maze[0].length) return;

        // Base case: Blocked cell
        if (!maze[row][column]) return;

        // Base case: Reached destination
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }
          maze[row][column] =false;
        if (row< maze.length-1)
        path(ans + " Down", maze, row + 1, column);

         if (column<maze[0].length-1)
         path(ans + " Right", maze, row, column + 1);

         if (row>0) path(ans + " up", maze, row-1, column);
         if (column>0) path(ans + " Down", maze, row, column -1 );
         maze[row][column] = true;
    }




}
