package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int y = 0; y < board[row].length - 1; y++) {
            if (board[row][y] != board[row][y + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
