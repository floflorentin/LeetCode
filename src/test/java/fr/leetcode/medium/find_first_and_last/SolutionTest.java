package fr.leetcode.medium.find_first_and_last;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void Test() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1}, solution.searchRange(new int[] {2,2}, 2));
        assertArrayEquals(new int[] {-1,-1}, solution.searchRange(new int[] {2,2}, 3));
        assertArrayEquals(new int[] {0, 0}, solution.searchRange(new int[] {1}, 1));
        assertArrayEquals(new int[] {3,4}, solution.searchRange(new int[] {5,7,7,8,8,10}, 8));
        assertArrayEquals(new int[] {-1,-1}, solution.searchRange(new int[] {5,7,7,8,8,10}, 6));
    }
}