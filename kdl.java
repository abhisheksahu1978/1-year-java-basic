import java.util.Random;
import java.util.Scanner;

public class kdl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int position = 5;
        int food = rand.nextInt(10);
        int score = 0;
        char move;

        System.out.println("🐍 Simple Snake Game");
        System.out.println("Controls: l = left, r = right");

        while (true) {
            System.out.println("--------------------");

            // Print line
            for (int i = 0; i < 10; i++) {
                if (i == position) {
                    System.out.print("S ");
                } else if (i == food) {
                    System.out.print("F ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println("\nScore: " + score);
            System.out.print("Move: ");
            move = sc.next().charAt(0);

            // Move snake
            if (move == 'l') {
                position--;
            } else if (move == 'r') {
                position++;
            }

            // Check wall collision
            if (position < 0 || position >= 10) {
                System.out.println("💀 Game Over!");
                break;
            }

            // Check food
            if (position == food) {
                score++;
                food = rand.nextInt(10);
                System.out.println("🍎 Food eaten!");
            }
        }

        System.out.println("Final Score: " + score);
    }
}