package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeaderBoardTest {

  @Test
  void findRanking() {
    int[][] params = {
        {65, 75, 85, 95},
        {45},
        {100}
    };
    int[][] expected = {
        {7, 5, 4, 2},
        {11},
        {1}
    };
    for (int i = 0; i < params.length; i++) {
      assertArrayEquals(expected[i], LeaderBoard.findRanking(params[i]));
    }
  }
}