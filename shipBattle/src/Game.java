import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Board playerBoard = new Board();
        Board enemyBoard = new Board();

        // Розміщення кораблів
        Random random = new Random();
        for (int i = 1; i <= 4; i++) {
            boolean placed;
            do {
                int x = random.nextInt(10);
                int y = random.nextInt(10);
                boolean horizontal = random.nextBoolean();
                placed = enemyBoard.placeShip(x, y, i, horizontal);
            } while (!placed);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Починаємо гру 'Морський бій'!");
        while (true) {
            System.out.println("Ваше поле:");
            playerBoard.printBoard(true);
            System.out.println("Поле супротивника:");
            enemyBoard.printBoard(false);

            System.out.print("Введіть координати для атаки (наприклад, A5): ");
            String input = scanner.nextLine();
            int x = Integer.parseInt(input.substring(1)) - 1;
            int y = input.charAt(0) - 'A';

            enemyBoard.attack(x, y);
        }
    }
}
