public class Answer {
    private final String answer = WordProvider.getWord();
    private String known = "";
    private Boolean isSolved = false;

    public void setKnown() {
        for (int i = 0; i < answer.length(); i++) {
            known += "_";
        }
    }

    public void updateKnown(String guess) {
        for (int i = 0; i < answer.length(); i++) {
            if (i == guess.length()) {
                break;
            }
            if (!answer.substring(i, i + 1).equals("_")) {
                if (answer.substring(i, i + 1).equals(guess.substring(i, i + 1))) {
                    known = known.substring(0, i) + answer.substring(i, i + 1) + known.substring(i + 1);
                }
            }
        }
    }

    public String getKnownOfGuess() {
        return known;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public int setPointValue() {
        return ((int) (Math.random() * 10 + 1));
    }

    public int scoreGuess(String guess, int pointValue) {
        int numCorrect = 0;
        for (int i = 0; i < answer.length(); i++) {
            String sub = answer.substring(i, i + 1);
            if (guess.contains(sub)) {
                numCorrect++;

            }
            if (guess.equals(answer)) {
                isSolved = true;
            }
        }
        return pointValue * numCorrect;
    }
}
