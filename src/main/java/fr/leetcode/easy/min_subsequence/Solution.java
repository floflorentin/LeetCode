package fr.leetcode.easy.min_subsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/description/">minimum-subsequence-in-non-increasing-order</a>
 */
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int leftSum = 0;
        int rightSum = 0;
        int j = nums.length - 1;

        var minSubsequence = new ArrayList<Integer>();
        while (i <= j) {
            if(rightSum > leftSum) {
                leftSum += nums[i++];
            } else {
                minSubsequence.add(nums[j]);
                rightSum += nums[j--];
            }
        }
        if(leftSum >= rightSum) {
            minSubsequence.add(nums[j]);
        }
        return minSubsequence;
    }
}