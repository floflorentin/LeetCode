package fr.leetcode.easy.missing_number;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.com/problems/missing-number/">missing-number</a>
 */

class Solution {
    public int missingNumber(int[] nums) {
        var n = nums.length + 1;
        var sum = IntStream.range(1, n).sum();
        return sum - Arrays.stream(nums).sum();
    }
}