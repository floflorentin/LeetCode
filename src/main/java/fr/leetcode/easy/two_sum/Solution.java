package fr.leetcode.easy.two_sum;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/two-sum/">two-sum</a>
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        return getIntsHash(nums, target);
    }

    private int[] getIntsHash(int[] nums, int target) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(pos.containsKey(target - nums[i])) {
                return new int[] {pos.get(target - nums[i]), i};
            }
            pos.put(nums[i], i);
        }
        return new int[0];
    }

    private int[] getIntsEasy(int[] nums, int target) {
        for(int i = 0; i  < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
