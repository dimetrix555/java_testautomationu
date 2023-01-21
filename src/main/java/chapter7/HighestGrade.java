package chapter7;
// Bogdan
public class HighestGrade {

    public static void main(String[] args) {
        int[] scores = {1, 5, 7, 120, 29, 100, 130, 39, 50, 70};
        System.out.printf("The highest grade: %d%n", findHighestScore(scores));
    }

    public static int findHighestScore(int[] scores) {
        int result;
        result = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > result) {
                result = scores[i];
            }
        }
        return result;
    }
}
