package fr.leetcode.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test() {
        var s = new Solution();
        assertTrue(s.isPalindrome(4554));
        assertTrue(s.isPalindrome(121));
        assertFalse(s.isPalindrome(123));
        assertFalse(s.isPalindrome(4555));
    }
}