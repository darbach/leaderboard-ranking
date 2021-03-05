package edu.cnm.deepdive;

/**
 * https://ddc-java-12.github.io/2021/03/01/preview-exam-1-practical-section/
 *
 * Assume you are given an int[] of final scores, in descending order, for some competition.
 * This is the leaderboard.
 *
 * Now, assume that a new participant joins the competition late. This is a multi-round
 * competition; the participant’s total score is recorded at the end of each round. For example,
 * after the 1st round, the participant might have a score of 10, then 20 after the 2nd round,
 * etc. The resulting array, in ascending order, contains the participant scores for this
 * late-entry participant.
 *
 * For each of the values in the participant’s scores, find the participant’s ranking, measured
 * against the leaderboard. Writing the code to construct and return the array of these values
 * is your task.
 *
 * The ranking scheme to be used is competition ranking, where the rank is equal to 1 plus the
 * number of leaderboard entries with higher scores than the one being ranked. For example, if
 * the leaderboard contains [100, 90, 90, 80, 75, 70, 60, 55, 55, 50], then a participant score
 * of 65 would earn a ranking of 7, since there are 6 elements of the leaderboard with higher
 * values than 65. Extending the example, if the participant’s scores are [65, 75, 85, 95], then
 * the array to be returned is [7, 5, 4, 2].
 */
public class LeaderBoard {

  public static int[] LEADERBOARD = {
      100,
      90,
      90,
      80,
      75,
      70,
      60,
      55,
      55,
      50
  };

  public static int[] findRanking(int[] scores) {
    int[] rankings = new int[scores.length];
    for (int i = 0; i < scores.length; i++) {
      int j = 0;
      int rank = 1;
      while (j < LEADERBOARD.length) {
        if (scores[i] < LEADERBOARD[j]) {
          rank++;
        } else {
          break;
        }
        j++;
      }
      rankings[i] = rank;
    }
    return rankings;
  }
}
