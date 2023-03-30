package fr.leetcode.longestsub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testArrSubHassLess() {
        var solution = new Solution();
        assertEquals(false, solution.arrSubHasLess(new int[]{1, 2}, 4));
        assertEquals(true, solution.arrSubHasLess(new int[]{1, 2}, 3));
    }


    @Test
    public void result() {
        var solution = new Solution();
    }
}