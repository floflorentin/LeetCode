package fr.leetcode.easy.add_digits;

/**
 * <a href="https://leetcode.com/problems/add-digits/">add digits</a>
 */
public class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
