package fr.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void tt() {
        var s = new Solution();
        int[] ar = new int[] {1,22};
        int[] r = new int[] {0,1,0,1};
        assertEquals(1,s.computeDayGains(2, ar, r));
    }
}