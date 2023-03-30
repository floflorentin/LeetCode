package fr.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

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
        return null;
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
