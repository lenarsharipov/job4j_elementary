package ru.job4j.array;

public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
                boolean result = true;
                for (int x = row; x < row + 1; x++) {
                        for (int i = 0; i < board[x].length; i++) {
                                if (board[x][i] != 'X') {
                                        result = false;
                                        break;
                                }
                        }
                }
                return result;
        }
}