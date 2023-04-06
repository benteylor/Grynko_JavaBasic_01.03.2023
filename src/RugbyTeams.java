import java.util.Random;

public class RugbyTeams {
    public static void main(String[] args) {
        int[][] teamAges = new int[2][25];
        int[][] teamBges = new int[2][25];
        Random rand = new Random();

        for (int i = 0; i < 25; i++) {
            teamAges[0][i] = i+1;
            teamAges[1][i] = rand.nextInt(23) + 18;

            teamBges[0][i] = i+1;
            teamBges[1][i] = rand.nextInt(23) + 18;
        }
        System.out.println("Вік гравців команди 1:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Гравець" + teamAges[0][i] + ": " + teamAges[1][i]);
        }
        System.out.println("Вік гравців команди 2:");
        for (int i = 0; i < 25; i++) {
            System.out.println("Гравець" + teamBges[0][i] + ": " + teamBges[1][i]);
        }
        double sumAgesTeamA = 0;
        double sumAgesTeamB = 0;
        for (int i = 0; i < 25; i++) {
            sumAgesTeamA += teamAges[1][i];
            sumAgesTeamB += teamBges[1][i];
        }
        double avgAgeTeamA = sumAgesTeamA / 25;
        double avgAgeTeamB = sumAgesTeamB / 25;
        System.out.println("Середній вік гравців команди 1: " + avgAgeTeamA);
        System.out.println("Середній вік гравців команди 2: " + avgAgeTeamB);
    }
}