package fr.leetcode.medium.longest;

import fr.leetcode.medium.longest.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test() {
        var solutio = new Solution();
        assertEquals(5, solutio.lengthOfLongestSubstring("tmmzuxt"));
        assertEquals(3, solutio.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solutio.lengthOfLongestSubstring("bbbbb"));
        assertEquals(4, solutio.lengthOfLongestSubstring("pwwkews"));
    }
}