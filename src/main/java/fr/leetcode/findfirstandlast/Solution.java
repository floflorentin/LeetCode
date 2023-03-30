package fr.leetcode.findfirstandlast;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0) {
            return new int[] {-1, -1};
        }
        var firstIndex = firstGreaterEqual(nums, target);
        if(firstIndex == nums.length || nums[firstIndex] != target) {
            return new int[] {-1, -1};
        }
        return new int[] {firstIndex, firstGreaterEqual(nums, target + 1) - 1};
    }

    private int firstGreaterEqual(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
