import java.util.*;

public class prob216 {

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for (char[] row : board)
            Arrays.fill(row, '.');

        solve(0, board, n);
    }

    static void solve(int row, char[][] board, int n) {
        if (row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, n);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        // Check left diagonal
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 'Q') return false;

        // Check right diagonal
        for (int i=row-1, j=col+1; i>=0 && j<n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row)
                System.out.print(c + " ");
            System.out.println();
        }
    }
}
