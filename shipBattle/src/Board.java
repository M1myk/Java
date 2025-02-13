

public class Board {
    private final char[][] grid = new char[10][10];
    private static final char EMPTY = '-';
    private static final char HIT = 'X';
    private static final char MISS = 'O';

    public Board() {
        // Ініціалізація порожнього поля
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = EMPTY;
            }
        }
    }

    public void printBoard(boolean revealShips) {
        System.out.print("  ");
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 10; j++) {
                if (grid[i][j] == 'S' && !revealShips) {
                    System.out.print(EMPTY + " ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public boolean placeShip(int x, int y, int length, boolean horizontal) {
        if (horizontal) {
            if (y + length > 10) return false; // Виходить за межі
            for (int i = y; i < y + length; i++) {
                if (grid[x][i] != EMPTY) return false; // Зайнято
            }
            for (int i = y; i < y + length; i++) {
                grid[x][i] = 'S';
            }
        } else {
            if (x + length > 10) return false;
            for (int i = x; i < x + length; i++) {
                if (grid[i][y] != EMPTY) return false;
            }
            for (int i = x; i < x + length; i++) {
                grid[i][y] = 'S';
            }
        }
        return true;
    }

    public boolean attack(int x, int y) {
        if (grid[x][y] == 'S') {
            grid[x][y] = HIT;
            System.out.println("Влучили!");
            return true;
        } else if (grid[x][y] == EMPTY) {
            grid[x][y] = MISS;
            System.out.println("Промах!");
            return false;
        } else {
            System.out.println("Ця клітинка вже атакувалась.");
            return false;
        }
    }
}
