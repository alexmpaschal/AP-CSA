package Unit7.ScoreInfoLab;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> stuScores = new ArrayList<>();

    public Stats(ArrayList<ScoreInfo> ss) {
        stuScores = ss;
    }

    public boolean record(int examScore) {
        for (ScoreInfo si: stuScores) {
            if (si.getScore() == examScore) {
                si.increment();
                return false;
            }
        }

        // no = "new object"
        ScoreInfo no = new ScoreInfo(examScore);
        stuScores.add(no);
        return true;
    }

    public int recordScores(int[] testScores) {
        int counter = 0;

        for (int score: testScores) {
            if (record(score)) {
                counter++;
            }
        }

        return counter;
    }

    public ArrayList<ScoreInfo> getAllScores() {
        return stuScores;
    }
}
