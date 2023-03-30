package fr.leetcode.medium.find_original_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testOriginalArray1() {
        var input = new int[]{1, 3, 4, 2, 6, 8};
        var output = new int[]{1, 3, 4};
        assertArrayEquals(output, solution.findOriginalArray(input));
    }

    @Test
    public void testOriginalArray2() {
        var input = new int[] {3, 6, 0, 1};
        var output = new int[] {};
        assertArrayEquals(output, solution.findOriginalArray(input));
    }

    @Test
    public void testZero() {
        var zeros = new int[] {0, 0, 0, 0};
        var output = new int[] {0,0};
        assertArrayEquals(output, solution.findOriginalArray(zeros));
    }

    @Test
    public void testImpair() {
        var zeros = new int[] {0, 0, 3};
        var output = new int[] {};
        assertArrayEquals(output, solution.findOriginalArray(zeros));
    }
}