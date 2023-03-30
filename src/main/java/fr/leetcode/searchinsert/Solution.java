package fr.leetcode.searchinsert;

public class Solution {
    public void searchInsert(int[] nums, int n) {

    }

    public int dicho(int[] nums, int n) {
        int mid = nums.length / 2 - 1;
        int low = 0;
        int high = nums.length - 1;
        while (mid != low && mid != high) {
            System.out.println("LOW : " + low);
            System.out.println("MID : " + mid);
            System.out.println("HIGH : " + high);
            if (nums[mid] > n) {
                high = mid;
                mid = midLowValue(2);
            } else {
                low = mid;
                mid = midHighValue(mid);
            }
            System.out.println("LOW : " + low);
            System.out.println("MID : " + mid);
            System.out.println("HIGH : " + high);
        }
        return (nums[mid] < n)? mid + 1: mid;
    }

    public int midHighValue(int mid) {
        return mid + mid / 2;
    }

    public int midLowValue(int mid) {
        return mid / 2;
    }
}
