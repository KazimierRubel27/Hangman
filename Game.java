public class Game {
    private Answer a = new Answer();
    private Player player1 = new Player();
    private Player player2 = new Player();

    public void play() {
        a.setKnown();
        String guess = "";
        int activePoints = 0;
        int activePlayer = 1;

        while (!a.isSolved()) {
            activePoints = a.setPointValue();
            System.out.println(activePoints + " is the value of points this turn");
            if (activePlayer == 1) {
                System.out.println("Known: " + a.getKnownOfGuess());
                System.out.println(player1.getName() + ", your turn");
                guess = player1.getGuess();
                player1.addPoints(a.scoreGuess(guess, activePoints));
                a.updateKnown(guess);
                System.out.println();
                activePlayer = 2;
            }
            if (activePlayer == 2) {
                System.out.println(player2.getName() + ", your turn");
                guess = player2.getGuess();
                player2.addPoints(a.scoreGuess(guess, activePoints));
                a.updateKnown(guess);
                System.out.println();
                activePlayer = 1;
            }
        }
        System.out.println("Game over");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the winner");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " is the winner");
        } else {
            System.out.println("It is a tie");
        }
    }
}
