import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            Game game = new Game();
            game.play();
            System.out.println("Do you want to play again? (y) or (n)");
            if (!sc.nextLine().toLowerCase().equals("y")) {
                break;
            }
        }
    }
}
