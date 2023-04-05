package fr.leetcode.easy.searchinsert;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int dicho(int[] nums, int target) {
        int mid = nums.length / 2 - 1;
        int low = 0;
        int high = nums.length - 1;
        while (nums[mid] != target) {
            if (nums[mid] > target) {
                high = mid;
                mid = mid / 2;
            } else if(nums[mid] < target){
                low = mid;
                mid =  mid + mid / 2;
            } else if(mid == low || mid == high) {
                return -1;
            }
        }
        return mid;
    }

    public int midHighValue(int mid) {
        return mid + mid / 2;
    }

    public int midLowValue(int mid) {
        return mid / 2;
    }
}
