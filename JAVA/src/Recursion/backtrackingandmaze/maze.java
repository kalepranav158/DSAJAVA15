package Recursion.backtrackingandmaze;

import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
           System.out.println(count(3, 3, 2));
           System.out.println();
           path("", 3, 3);
           System.out.println();
           ArrayList<String>Ans = retpath("",3,3);
           System.out.println(Ans);
           ArrayList<String>Ans2 = diagonal("",3,3);
           System.out.println(Ans2);

          boolean [][] maze = {{true,true,true},
                               {true,false,true},
                               {true,true,true}
          };
        System.out.println("Maze Game");
        obstacles("",maze,0,0);
    }

    static int count(int row, int column, int z) {
        if (z == 2) System.out.println("At Orignal Position");
        if (z == 0) System.out.println("Down");
        if (z == 1) System.out.println("Right");
        if (row == 1 || column == 1)
            return 1;
        int left = count(row - 1, column, 0);
        int right = count(row, column - 1, 1);
        return left + right;
    }

    static void path(String ans, int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(ans);
            return ;
        }
        if (row > 1) path(ans+" Down", row - 1, column);
        if (column > 1) path(ans+ " Right", row, column-1);
    }



    static ArrayList<String> retpath(String ans,int c ,int  r) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> finalans = new ArrayList<>();
        if (r > 1) finalans.addAll(retpath(ans+" Down", r-1, c));
        if (c > 1) finalans.addAll(retpath(ans+ " Right", r, c-1));

        return finalans;
    }


    static ArrayList<String> diagonal(String ans,int c ,int  r) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> finalans = new ArrayList<>();
        if (r>1&&c>1) finalans.addAll(retpath(ans+ "Diagonal",r-1,c-1));
        if (r > 1) finalans.addAll(retpath(ans+" Down", r-1, c));
        if (c > 1) finalans.addAll(retpath(ans+ " Right", r, c-1));

        return finalans;
    }

    static void obstacles(String ans, boolean[][] maze, int row, int column) {
        // Base case: Out of bounds
        if (row >= maze.length || column >= maze[0].length) return;

        // Base case: Blocked cell
        if (!maze[row][column]) return;

        // Base case: Reached destination
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(ans);
            return;
        }

        // Move down
        obstacles(ans + " Down", maze, row + 1, column);

        // Move right
        obstacles(ans + " Right", maze, row, column + 1);
    }
}