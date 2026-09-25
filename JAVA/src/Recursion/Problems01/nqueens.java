package Recursion.Problems01;
// you are given a n x n board and placed n queens on it  such that no queen should eleminate each other
// display how many ways you can do this and display
public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        // checking for every row and column to place the queen
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        // vertial diagonal
        for (int i = 0; i < row; i++) {
            if (board[i][col])
                return false;
        }

        // left diagoanl
        int max_left = Math.min(row, col);
        for (int i = 1; i <= max_left; i++)
            if (board[row - i][col - i]) return false;

        int max_right = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= max_right; i++)
            if (board[row - i][col + i]) return false;

        return true;
    }


    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("x ");
            }
            System.out.println();
        }
        System.out.println(); // Separate boards

    }
}

