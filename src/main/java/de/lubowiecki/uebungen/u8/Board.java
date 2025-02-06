package de.lubowiecki.uebungen.u8;

public class Board {

    private final String[][] board;

    public Board(int rows, int cols) {
        board = new String[rows][cols];
    }

    public void print() {

        for(String[] row : board) {
            System.out.print("|");
            for(String col : row) {
                if(col == null) col = " ";
                System.out.printf("%2s ", col);
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
