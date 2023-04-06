package fr.leetcode.easy.longest_palindrome;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome/">longest-palindrome</a>
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] letters = new int[58]; // [A-z + ([|\)
        Arrays.fill(letters, 0);

        int sum = 0;
        for(Character c: s.toCharArray()) {
            int index = c - 65;
            if(letters[index] == 1) {
                sum+= 2;
                letters[index] = 0;
            } else {
                letters[index] = 1;
            }
        }
        for(int letter: letters) {
            if(letter == 1) {
                return sum + 1;
            }
        }
        return sum;
    }
}
