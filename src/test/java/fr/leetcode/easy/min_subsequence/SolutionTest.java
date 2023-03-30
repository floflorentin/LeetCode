package fr.leetcode.easy.min_subsequence;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    public void TestMinSubSequence1() {
        var input = new int[] {4,3,10,9,8};
        var output = new ArrayList<Integer>(List.of(10,9));
        var s = new Solution();
        assertEquals(output, s.minSubsequence(input));
    }

    @Test
    public void TestMinSubSequence2() {
        var input = new int[] {4,4,7,6,7};
        var output = new ArrayList<Integer>(List.of(7,7,6));
        var s = new Solution();
        assertEquals(output, s.minSubsequence(input));
    }

    @Test
    public void TestHarderCase() {
        var input = new int[] {4,10,2,6,1};
        var output = new ArrayList<Integer>(List.of(10,6));
        var s = new Solution();
        assertEquals(output, s.minSubsequence(input));
    }
}