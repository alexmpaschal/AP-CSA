package Unit7.ScoreInfoLab;

public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int ts) {
        score = ts;
        numStudents = 1;
    }

    public void increment() {
        numStudents++;
    }

    public int getScore() {
        return score;
    }

    public int getFrequency() {
        return numStudents;
    }
}
