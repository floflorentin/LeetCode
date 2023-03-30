package fr.leetcode.easy.single_number;

/**
 * <a href="https://leetcode.com/problems/single-number/description/">single-</a>
 */

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}