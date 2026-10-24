import java.util.*;
import java.util.stream.*;
public class TestStatistics {
    public static void main(String[] args) {
      int[] test_scores = {20, 10, 30, 29, 39, 65, 26, 37, 97, 69};
      Arrays.sort(test_scores);
      int lowest_score = test_scores[0];
      int highest_score = test_scores[9];
      int sum = IntStream.of(test_scores).sum();
      float average = sum / test_scores.length;
      float median = (test_scores[5] + test_scores[6])/ 2;
        System.out.println("Average = " + average);
        System.out.println("highest_score = " + highest_score);
        System.out.println("lowest_score = " + lowest_score);
        System.out.println("median = " + median);
    }
}
