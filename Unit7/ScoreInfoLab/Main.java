package Unit7.ScoreInfoLab;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<ScoreInfo> scores1 = new ArrayList<ScoreInfo>(30);
        ArrayList<ScoreInfo> scores2 = new ArrayList<ScoreInfo>(30);

        addRandomScoresToArrayList(scores1);
        addRandomScoresToArrayList(scores2);

        Stats exam1 = new Stats(scores1);
        Stats exam2 = new Stats(scores2);

        int[] thisExam1 = new int[20];
        int[] thisExam2 = new int[20];

        addRandomScoresToList(thisExam1);
        addRandomScoresToList(thisExam2);

        System.out.println(exam1.recordScores(thisExam1));
        System.out.println(exam2.recordScores(thisExam2));

        ArrayList<ScoreInfo> newScores1 = exam1.getAllScores();
        ArrayList<ScoreInfo> newScores2 = exam2.getAllScores();


        for (int i = 0; i < newScores1.size(); i++) {
            System.out.println(newScores1.get(i).getScore() + " " + newScores1.get(i).getFrequency());
        }
        for (int i = 0; i < newScores2.size(); i++) {
            System.out.println(newScores2.get(i).getScore() + " " + newScores2.get(i).getFrequency());
        }
    }

    public static void addRandomScoresToArrayList(ArrayList<ScoreInfo> al) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            ScoreInfo obj = new ScoreInfo(random.nextInt(101));
            al.add(obj);
        }
    }

    public static void addRandomScoresToList(int[] e) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            e[i] = random.nextInt(101);
            System.out.println(random.nextInt(101));
        }
    }
}
