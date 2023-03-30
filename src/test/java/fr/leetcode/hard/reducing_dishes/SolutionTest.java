package fr.leetcode.hard.reducing_dishes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void testMaxSatisfaction1() {
        var s = new Solution();

        var input = new int[] {-1, -8, 0, 5, -9};
        var output = 14;
        assertEquals(output, s.maxSatisfaction(input));
    }

    @Test
    public void testMaxSatisfaction2() {
        var s = new Solution();

        var input = new int[] {4,3,2};
        var output = 20;
        assertEquals(output, s.maxSatisfaction(input));
    }

    @Test
    public void testNoGoodResult() {
        var s = new Solution();

        var input = new int[] {-1,-4,-5};
        var output = 0;
        assertEquals(output, s.maxSatisfaction(input));
    }

    @Test
    public void testHardCase() {
        var s = new Solution();

        var input = new int[] {76,83,55,-36,-8,40,-60,-72,27,-32,37,1,77,24,-46,-26,20,-89,-35,-99,58,-7};
        var output = 7281;
        assertEquals(output, s.maxSatisfaction(input));
    }
}