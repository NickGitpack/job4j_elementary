package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char x = 'X';
        for (int y = 0; y < board[row].length; y++) {
            if (board[row][y] != x) {
                result = false;
                break;
            }
        }
        return result;
    }
}
