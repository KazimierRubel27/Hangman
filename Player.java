import java.util.Scanner;

public class Player {
    private static Scanner sc = new Scanner(System.in);
    private String playername;
    private int playerscore = 0;

    public Player() {
        setName();
    }

    public Player(String name) {
        this.playername = name;
    }

    public void setName() {
        System.out.println("Input your name:");
        this.playername = sc.nextLine();
    }

    public String getName() {
        return this.playername;
    }

    public void addPoints(int amount) {
        this.playerscore += amount;
    }

    public int getScore() {
        return this.playerscore;
    }

    public String getGuess() {
        System.out.println("Input your guess:");
        return sc.nextLine();
    }
}
